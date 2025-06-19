package com.name.matmores.mixin;

import com.thevortex.allthemodium.events.BlockBreak;
import com.thevortex.allthemodium.reference.Reference;
import net.minecraftforge.event.world.BlockEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BlockBreak.class)
public class MixinBlockBreak {
    @Inject(at = @At("RETURN"), method = "on", remap = false)
    private static void on(BlockEvent.BreakEvent event, CallbackInfo ci) {
        if (event.getState().getBlock().getTags().contains(Reference.ORETYPE) || event.getState().getBlock().getTags().contains(Reference.ORETYPE2) || event.getState().getBlock().getTags().contains(Reference.ORETYPE3)) {
            event.setCanceled(false);
        }
    }
}
