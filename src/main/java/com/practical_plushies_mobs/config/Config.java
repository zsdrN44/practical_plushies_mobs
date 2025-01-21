package com.practical_plushies_mobs.config;

import com.practical_plushies_mobs.PracticalPlushiesMobs;
import elocindev.necronomicon.config.NecConfig;
import java.nio.file.Path;
import net.fabricmc.loader.api.FabricLoader;

public class Config {

    @NecConfig
    public static Config INSTANCE;
    public boolean enable_drops = true;

    public static String getFile() {
        Path folder = FabricLoader.getInstance().getConfigDir().resolve("practical_plushies");
        if (!folder.toFile().exists()) {
            folder.toFile().mkdir();
        }
        return folder.resolve(PracticalPlushiesMobs.CONFIG_FILE).toString();
    }
}