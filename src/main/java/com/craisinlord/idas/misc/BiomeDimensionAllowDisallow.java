package com.craisinlord.idas.misc;

import com.craisinlord.idas.IDAS;
import com.craisinlord.idas.modinit.IDASStructures;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class BiomeDimensionAllowDisallow {
    private BiomeDimensionAllowDisallow() {}

    public static final Map<ResourceLocation, List<Pattern>> DIMENSION_DISALLOW = new HashMap<>();
    public static final Map<ResourceLocation, List<Pattern>> DIMENSION_ALLOW = new HashMap<>();
    public static final Map<ResourceLocation, List<Pattern>> BIOME_ALLOW = new HashMap<>();
    public static final Map<ResourceLocation, List<Pattern>> BIOME_DISALLOW = new HashMap<>();

    public static void setupAllowDisallowMaps(){
        // init maps with all structures/some configuredfeatures and blank lists
        IDASStructures.IDAS_STRUCTURES.forEach((key, value) -> {
            ResourceLocation id = Registry.STRUCTURE_FEATURE.getKey(key);
            DIMENSION_DISALLOW.put(id, new ArrayList<>());
            DIMENSION_ALLOW.put(id, new ArrayList<>());
            BIOME_ALLOW.put(id, new ArrayList<>());
            BIOME_DISALLOW.put(id, new ArrayList<>());
        });
    }

    private static void setupMap(Map<ResourceLocation, List<Pattern>> mapToFillWithPatterns, Map<String, String> configMap, String errorMsg) {
        for(Map.Entry<String, String> configMapEntry : configMap.entrySet()){
            List<String> parsedValues = Arrays.stream(configMapEntry.getValue().split(",")).map(String::trim).collect(Collectors.toList());
            ResourceLocation worldgenObjectID = new ResourceLocation(configMapEntry.getKey());

            // If the key is "all", take the value patterns and give it to all of the entries in the map
            if(configMapEntry.getKey().equals("all")){
                mapToFillWithPatterns.values().forEach(patternList -> parsedValues.forEach(pattern -> patternList.add(Pattern.compile(pattern))));
            }
            // Add the patterns to the key ID of the worldgen thing.
            else if(mapToFillWithPatterns.containsKey(worldgenObjectID)){
                parsedValues.forEach(patternList -> mapToFillWithPatterns.get(worldgenObjectID).add(Pattern.compile(patternList)));
            }
            // Error msg for unknown keys (typo'ed structure registry names etc)
            else{
                IDAS.LOGGER.warn("Integrated Dungeons and Structures: Unknown key {} was found in the {} config. Skipping that entry...", worldgenObjectID, errorMsg);
            }
        }
    }
}
