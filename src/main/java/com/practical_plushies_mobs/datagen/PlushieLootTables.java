package com.practical_plushies_mobs.datagen;

import java.util.ArrayList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;


public class PlushieLootTables extends FabricBlockLootTableProvider {
    private static Block[] dataBlockArray;

    public PlushieLootTables(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    // 用于添加方块列表，将 ArrayList 转换为 Block 数组
    public static void addDropEntries(ArrayList<Block> blockArray) {
        dataBlockArray = (Block[]) blockArray.toArray(new Block[0]);
    }

    @Override
    public void generate() {
        // 检查 dataBlockArray 是否为空，避免对空数组进行操作
        if (dataBlockArray!= null && dataBlockArray.length > 0) {
            for (int i = 0; i < dataBlockArray.length; i++) {
                // 为每个方块添加掉落物
                addDrop(dataBlockArray[i]);
            }
        } else {
            // 可以输出日志或采取其他处理方式，这里简单打印错误信息
            System.err.println("No blocks to generate loot tables for, dataBlockArray is empty.");
        }
    }
}