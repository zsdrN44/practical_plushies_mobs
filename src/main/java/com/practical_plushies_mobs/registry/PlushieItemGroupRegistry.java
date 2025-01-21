package com.practical_plushies_mobs.registry;

import com.practical_plushies_mobs.PracticalPlushiesMobs;
import java.util.ArrayList;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class PlushieItemGroupRegistry {
    private static Block[] plushieArray;
    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder().icon(() -> {
        return new ItemStack(PlushieRegistry.ZOMBIE_PLUSHIE);
    }).displayName(Text.translatable("itemGroup.practical_plushies_mobs.plushieGroup")).entries((context, entries) -> {
        for (int i = 0; i < plushieArray.length; i++) {
            entries.add(plushieArray[i]);
        }
    }).build();

    public static void addItemGroupEntries(ArrayList<Block> blockArray) {
        PracticalPlushiesMobs.LOGGER.info(blockArray.toString());
        plushieArray = (Block[]) blockArray.toArray(new Block[0]);
    }

    public static void register() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(PracticalPlushiesMobs.MODID, "plushie_group"), ITEM_GROUP);
    }
}