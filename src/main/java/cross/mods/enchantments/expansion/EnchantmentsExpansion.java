package cross.mods.enchantments.expansion;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

@Mod(EnchantmentsExpansion.ID)
public class EnchantmentsExpansion {

    public static final String ID = "enchantments_expansion";
    public static final ConfigHandler CONFIG;
    public static final ModConfigSpec CONFIG_SPEC;

    static {
        final Pair<ConfigHandler, ModConfigSpec> SPEC_PAIR = new ModConfigSpec.Builder().configure(ConfigHandler::new);
        CONFIG = SPEC_PAIR.getLeft();
        CONFIG_SPEC = SPEC_PAIR.getRight();
    }

    public EnchantmentsExpansion(ModContainer mod) {
        mod.registerConfig(ModConfig.Type.COMMON, CONFIG_SPEC);
        mod.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }
}
