package com.name.matmores.mixin;

import com.name.matmores.Matmores;
import com.thevortex.allthemodium.blocks.Allthemodium_Ore;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Allthemodium_Ore.class)
public class MixinAllTheModiumOre {
    @ModifyConstant(method = "<init>", constant = @Constant(floatValue = -1.0F))
    private static float changeHardness(float hardness) {
        return 100f;
    }

    /**
     * @author name
     * @reason Allow fake players to mine the ore
     */
    @Overwrite(remap = false)
    public boolean canEntityDestroy(BlockState state, BlockGetter world, BlockPos pos, Entity player) {
        return true;
    }
}
