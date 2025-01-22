package com.name.matmores;

import com.mojang.logging.LogUtils;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Matmores.MODID)
public class Matmores {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "matmores";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public Matmores() {
    }
}
