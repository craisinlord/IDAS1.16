package com.craisinlord.idas.utils;

import com.google.common.collect.ImmutableSet;
import com.craisinlord.idas.IDAS;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.Node;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.filter.AbstractFilter;
import org.apache.logging.log4j.message.Message;

import java.util.Set;

@Plugin(name = "LogSpamFiltering", category = Node.CATEGORY, elementType = Filter.ELEMENT_TYPE)
public class LogSpamFiltering extends AbstractFilter {

    private static final Set<ResourceLocation> SILENCED_PIECES = ImmutableSet.of(
            new ResourceLocation("minecraft:mineshaft_room_rs"),
            new ResourceLocation("minecraft:mineshaft_corridor_rs"),
            new ResourceLocation("minecraft:mineshaft_crossing_rs"),
            new ResourceLocation("minecraft:mineshaft_stairs_rs"),
            new ResourceLocation("minecraft:jungle_fortress_start"),
            new ResourceLocation("minecraft:jungle_fortress_entrance"),
            new ResourceLocation("minecraft:jungle_fortress_end"),
            new ResourceLocation("minecraft:jungle_fortress_straight"),
            new ResourceLocation("minecraft:jungle_fortress_corridor_5"),
            new ResourceLocation("minecraft:jungle_fortress_corridor_4"),
            new ResourceLocation("minecraft:jungle_fortress_corridor_3"),
            new ResourceLocation("minecraft:jungle_fortress_corridor_2"),
            new ResourceLocation("minecraft:jungle_fortress_corridor_1"),
            new ResourceLocation("minecraft:jungle_fortress_crossing_3"),
            new ResourceLocation("minecraft:jungle_fortress_crossing_2"),
            new ResourceLocation("minecraft:jungle_fortress_crossing_1"),
            new ResourceLocation("minecraft:jungle_fortress_mushroom_room"),
            new ResourceLocation("minecraft:jungle_fortress_throne"),
            new ResourceLocation("minecraft:jungle_fortress_stairs"),
            new ResourceLocation("minecraft:stronghold_chest_corridor"),
            new ResourceLocation("minecraft:stronghold_corridor"),
            new ResourceLocation("minecraft:stronghold_portal_room"),
            new ResourceLocation("minecraft:stronghold_library"),
            new ResourceLocation("minecraft:stronghold_prison"),
            new ResourceLocation("minecraft:stronghold_room_crossing"),
            new ResourceLocation("minecraft:stronghold_crossing"),
            new ResourceLocation("minecraft:stronghold_right_turn"),
            new ResourceLocation("minecraft:stronghold_left_turn"),
            new ResourceLocation("minecraft:stronghold_straight"),
            new ResourceLocation("minecraft:stronghold_stairs"),
            new ResourceLocation("minecraft:stronghold_stairs_straight"),
            new ResourceLocation("minecraft:stronghold_entrance_stairs"),
            new ResourceLocation(IDAS.MODID, "mansion_piece")
    );

    @Override
    public Filter.Result filter(LogEvent event) {
        Message message = event.getMessage();
        if (message != null) {
            if(message.getFormattedMessage().contains("Unknown structure piece")) {
                Object[] rl = message.getParameters();
                if(rl.length > 0 && SILENCED_PIECES.contains((ResourceLocation)(rl[0])) || message.getFormattedMessage().contains(IDAS.MODID)) {
                    return Result.DENY;
                }
            }
            else if(message.getFormattedMessage().contains("Unknown structure start: repurposed_structures:")) {
                return Result.DENY;
            }
        }

        return Result.NEUTRAL;
    }
}
