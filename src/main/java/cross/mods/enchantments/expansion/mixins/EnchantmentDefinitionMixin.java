package cross.mods.enchantments.expansion.mixins;

import cross.mods.enchantments.expansion.EnchantmentsExpansion;
import net.minecraft.world.item.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Enchantment.EnchantmentDefinition.class)
public class EnchantmentDefinitionMixin {

    @Shadow @Final private int maxLevel;

    /**
     * @author CrossVas
     * @reason AAA
     */
    @Overwrite
    public int maxLevel() {
        return this.maxLevel > 1 ? EnchantmentsExpansion.CONFIG.ENCH_MAX.get() : 1;
    }
}
