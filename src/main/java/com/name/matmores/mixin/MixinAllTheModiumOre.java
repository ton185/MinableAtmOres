package com.name.matmores.mixin;

import com.thevortex.allthemodium.blocks.Allthemodium_Ore;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Allthemodium_Ore.class)
public class MixinAllTheModiumOre extends Block {
    public MixinAllTheModiumOre(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @Overwrite(remap = false)
    public boolean canHarvestBlock(BlockState state, IBlockReader world, BlockPos pos, PlayerEntity player) {
        return super.canHarvestBlock(state, world, pos, player); // not 100% sure if it will work like this, might need return true
    }
}
