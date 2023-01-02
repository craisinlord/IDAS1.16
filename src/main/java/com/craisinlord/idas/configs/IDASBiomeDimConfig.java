package com.craisinlord.idas.configs;

import com.craisinlord.idas.configs.omegaconfig.api.Config;

import java.util.HashMap;
import java.util.Map;

public class IDASBiomeDimConfig implements Config {

    @Override
    public String getName() {
        return "idas-forge/biome_dimension_allow_disallow_configs";
    }

    @Override
    public String getExtension() {
        return "json5";
    }

    @Override
    public void save() {

        if(configVersion == 1){
            // Simplify abyss config entries
            addEntries(disallowedDimensions, "all", "theabyss:.+");
            addEntries(disallowedDimensions, "all", "the_bumblezone:the_bumblezone");
            addEntries(disallowedDimensions, "all", "twilightforest:twilightforest");
            addEntries(disallowedDimensions, "all", "nether");
            addEntries(disallowedDimensions, "all", "the_end");
            addEntries(disallowedDimensions, "all", "undergarden:undergarden");
            addEntries(disallowedDimensions, "all", "the_midnight:the_midnight");
            addEntries(disallowedDimensions, "all", "advancedrocketry:space");
            addEntries(disallowedDimensions, "all", "pokecube:secret_base");
            addEntries(disallowedDimensions, "all", "pokecube_legends:distorted_world");
            addEntries(disallowedDimensions, "all", "pokecube_legends:ultraspace");
            addEntries(disallowedDimensions, "all", "dystopia:dystopia");
            addEntries(disallowedDimensions, "all", "elvenation:elvenia_dimension");
            addEntries(disallowedDimensions, "all", "futurepack:.+");
            addEntries(disallowedDimensions, "all", "the_afterlight:.+");
            addEntries(disallowedDimensions, "all", "lotr:middle_earth");
            addEntries(disallowedDimensions, "all", "thebeginning:.+");
        }
    }

    private void fixKeyEntry(Map<String, String> map, String oldKey, String newKey){
        for(String entry : map.get(oldKey).split(",")){
            addEntries(map, newKey, entry.trim());
        }
        map.remove(oldKey);
    }

    private void addEntries(Map<String, String> map, String key, String entry){
        // assign entry
        if(map.putIfAbsent(key, entry) != null && !map.get(key).contains(entry)){
            map.put(key, map.get(key) + ", " + entry); // append entry
        }
    }

    private void removeEntries(Map<String, String> map, String key, String entry){
        if(map.containsKey(key) && map.get(key).contains(entry)){
            String newEntry = map.get(key)
                    .replace(entry+", ", "")
                    .replace(entry+",", "")
                    .replace(entry, "");

            if(newEntry.isEmpty()){
                map.remove(key);
            }
            else{
                map.put(key, newEntry);
            }
        }
    }
    public final Map<String, String> disallowedDimensions = new HashMap<>();
    public final Map<String, String> allowedDimensions = new HashMap<>();
    public final Map<String, String> disallowedBiomes = new HashMap<>();
    public final Map<String, String> allowedBiomes = new HashMap<>();
    public int configVersion = 1; // DO NOT TOUCH ANYMORE
}
