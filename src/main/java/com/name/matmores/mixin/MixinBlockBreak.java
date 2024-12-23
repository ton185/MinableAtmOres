package com.name.matmores.mixin;

import com.name.matmores.Matmores;
import com.thevortex.allthemodium.events.BlockBreak;
import com.thevortex.allthemodium.registry.TagRegistry;
import net.minecraftforge.event.level.BlockEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BlockBreak.class)
public class MixinBlockBreak {
    @Inject(at = @At("RETURN"), method = "on(Lnet/minecraftforge/event/level/BlockEvent$BreakEvent;)V", remap = false)
    private static void on(BlockEvent.BreakEvent event, CallbackInfo ci) {
        if (event.getState().is(TagRegistry.ALLTHEMODIUM_ORE) || event.getState().is(TagRegistry.VIBRANIUM_ORE) || event.getState().is(TagRegistry.UNOBTAINIUM_ORE)) {
            event.setCanceled(false);
        }
    }
}
