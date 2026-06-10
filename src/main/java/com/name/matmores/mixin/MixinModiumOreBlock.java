package com.name.matmores.mixin;

import net.allthemods.allthemodium.common.blocks.ModiumOreBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ModiumOreBlock.class)
public abstract class MixinModiumOreBlock extends RedStoneOreBlock {
    public MixinModiumOreBlock(Properties properties) {
        super(properties);
    }

    /**
     * @author name
     * @reason Allow fake players to mine the ore
     */
    @Overwrite
    public boolean canEntityDestroy(BlockState state, BlockGetter level, BlockPos pos, Entity entity) {
        return super.canEntityDestroy(state, level, pos, entity);
    }
}
