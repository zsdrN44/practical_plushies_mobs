package com.practical_plushies_mobs.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGeneration implements DataGeneratorEntrypoint {
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack myPack = fabricDataGenerator.createPack();
        myPack.addProvider(PlushieLootTables::new);
        myPack.addProvider(PlushieLanguages::new);
    }
}