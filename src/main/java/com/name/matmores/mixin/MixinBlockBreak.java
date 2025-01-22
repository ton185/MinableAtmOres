package com.name.matmores.mixin;

import com.name.matmores.Matmores;
import com.thevortex.allthemodium.events.BlockBreak;
import com.thevortex.allthemodium.registry.TagRegistry;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.event.level.BlockEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BlockBreak.class)
public class MixinBlockBreak {
    @Inject(at = @At("RETURN"), method = "on(Lnet/neoforged/neoforge/event/level/BlockEvent$BreakEvent;)V", remap = false)
    private static void on(BlockEvent.BreakEvent event, CallbackInfo ci) {
        BlockState state = event.getState();
        if (state.is(TagRegistry.ALLTHEMODIUM_ORE) || state.is(TagRegistry.VIBRANIUM_ORE) || state.is(TagRegistry.UNOBTAINIUM_ORE) || (state.is(TagRegistry.OTHER_PROTECTION) && event.getLevel().getBiome(event.getPos()).is(TagRegistry.OTHER_BIOMES))) {
            event.setCanceled(false);
        }
    }
}
