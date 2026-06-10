package com.name.matmores.mixin;

import net.allthemods.allthemodium.core.registry.ATMBlocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ATMBlocks.class)
public class MixinATMBlocks {
    @ModifyConstant(method = {"lambda$static$4", "lambda$static$3", "lambda$static$2", "lambda$static$1", "lambda$static$0"}, constant = @Constant(floatValue = -1f))
    private static float changeHardness(float hardness) {
        return 100f;
    }
}
