package com.name.matmores.mixin;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.level.block.BreakBlockEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(targets = "net.allthemods.allthemodium.core.event.ATMEventListener$Common")
public class MixinATMEventListener {
    /**
     * @author name
     * @reason Get rid of fake player check
     */
    @Overwrite
    private static void onBlockBreak(BreakBlockEvent event) {
    }
}
