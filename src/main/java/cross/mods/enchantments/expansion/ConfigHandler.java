package cross.mods.enchantments.expansion;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ConfigHandler {

    public final ModConfigSpec.IntValue ENCH_MAX;

    public ConfigHandler(ModConfigSpec.Builder builder) {
        builder.push("common");
        this.ENCH_MAX = builder.defineInRange("maxLevel", 8, 0, 8);
        builder.pop();
    }
}
