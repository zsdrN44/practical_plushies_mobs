//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.practical_plushies_mobs.datagen;

import com.practical_plushies_mobs.registry.PlushieRegistry;
import java.util.function.Consumer;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

public class PlushieRecipes extends FabricRecipeProvider {
    public PlushieRecipes(FabricDataOutput output) {
        super(output);
    }

    public void generate(Consumer<RecipeJsonProvider> exporter) {
        this.generatePlushieRecipe(PlushieRegistry.CREEPER_PLUSHIE, Blocks.LIME_WOOL, Blocks.GREEN_WOOL, Items.GUNPOWDER, exporter);
        this.generatePlushieRecipe(PlushieRegistry.ENDERMAN_PLUSHIE, Blocks.BLACK_WOOL, Blocks.MAGENTA_WOOL, Items.ENDER_EYE, exporter);
        this.generatePlushieRecipe(PlushieRegistry.GHAST_PLUSHIE, Blocks.WHITE_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.GHAST_TEAR, exporter);
        this.generatePlushieRecipe(PlushieRegistry.PHANTOM_PLUSHIE, Blocks.BLUE_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.PHANTOM_MEMBRANE, exporter);
        this.generatePlushieRecipe(PlushieRegistry.SKELETON_PLUSHIE, Blocks.WHITE_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.BOW, exporter);
        this.generatePlushieRecipe(PlushieRegistry.SPIDER_PLUSHIE, Blocks.BLACK_WOOL, Blocks.GRAY_WOOL, Items.STRING, exporter);
        this.generatePlushieRecipe(PlushieRegistry.WITCH_PLUSHIE, Blocks.PURPLE_WOOL, Blocks.GRAY_WOOL, Items.RED_MUSHROOM, exporter);
        this.generatePlushieRecipe(PlushieRegistry.WITHER_SKELETON_PLUSHIE, Blocks.BLACK_WOOL, Blocks.GRAY_WOOL, Items.COAL, exporter);
        this.generatePlushieRecipe(PlushieRegistry.ZOGLIN_PLUSHIE, Blocks.PINK_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.GOLD_INGOT, exporter);
        this.generatePlushieRecipe(PlushieRegistry.ZOMBIE_PLUSHIE, Blocks.GREEN_WOOL, Blocks.PURPLE_WOOL, Items.ROTTEN_FLESH, exporter);
        this.generatePlushieRecipe(PlushieRegistry.SKELETON_HORSE_PLUSHIE, Blocks.WHITE_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.SADDLE, exporter);
        this.generatePlushieRecipe(PlushieRegistry.ALLAY_PLUSHIE, Blocks.LIGHT_BLUE_WOOL, Blocks.CYAN_WOOL, Items.IRON_INGOT, exporter);
        this.generatePlushieRecipe(PlushieRegistry.AXOLOTL_PLUSHIE, Blocks.PINK_WOOL, Blocks.MAGENTA_WOOL, Items.WATER_BUCKET, exporter);
        this.generatePlushieRecipe(PlushieRegistry.BEE_PLUSHIE, Blocks.YELLOW_WOOL, Blocks.BLACK_WOOL, Items.HONEYCOMB, exporter);
        this.generatePlushieRecipe(PlushieRegistry.CHICKEN_PLUSHIE, Blocks.LIGHT_GRAY_WOOL, Blocks.GRAY_WOOL, Items.EGG, exporter);
        this.generatePlushieRecipe(PlushieRegistry.COW_PLUSHIE, Blocks.BROWN_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.MILK_BUCKET, exporter);
        this.generatePlushieRecipe(PlushieRegistry.FOX_PLUSHIE, Blocks.ORANGE_WOOL, Blocks.BROWN_WOOL, Items.SWEET_BERRIES, exporter);
        this.generatePlushieRecipe(PlushieRegistry.PARROT_PLUSHIE, Blocks.RED_WOOL, Blocks.LIGHT_BLUE_WOOL, Items.FEATHER, exporter);
        this.generatePlushieRecipe(PlushieRegistry.PIG_PLUSHIE, Blocks.PINK_WOOL, Blocks.MAGENTA_WOOL, Items.CARROT, exporter);
        this.generatePlushieRecipe(PlushieRegistry.SHEEP_PLUSHIE, Blocks.WHITE_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.WHEAT, exporter);
        this.generatePlushieRecipe(PlushieRegistry.TURTLE_PLUSHIE, Blocks.LIME_WOOL, Blocks.GREEN_WOOL, Items.TURTLE_EGG, exporter);
        this.generatePlushieRecipe(PlushieRegistry.CAMEL_PLUSHIE, Blocks.YELLOW_WOOL, Blocks.BROWN_WOOL, Items.CACTUS, exporter);
        this.generatePlushieRecipe(PlushieRegistry.HORSE_PLUSHIE, Blocks.BROWN_WOOL, Blocks.GRAY_WOOL, Items.SADDLE, exporter);
        this.generatePlushieRecipe(PlushieRegistry.MOOSHROOM_PLUSHIE, Blocks.RED_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.RED_MUSHROOM, exporter);
        this.generatePlushieRecipe(PlushieRegistry.FROG_PLUSHIE, Blocks.LIME_WOOL, Blocks.YELLOW_WOOL, Items.SLIME_BALL, exporter);
        this.generatePlushieRecipe(PlushieRegistry.RABBIT_PLUSHIE, Blocks.BROWN_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.CARROT, exporter);
        this.generatePlushieRecipe(PlushieRegistry.CAT_PLUSHIE, Blocks.ORANGE_WOOL, Blocks.YELLOW_WOOL, Items.SALMON, exporter);
        this.generatePlushieRecipe(PlushieRegistry.WOLF_PLUSHIE, Blocks.WHITE_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.BONE, exporter);
        this.generatePlushieRecipe(PlushieRegistry.SNIFFER_PLUSHIE, Blocks.LIME_WOOL, Blocks.RED_WOOL, Items.WHEAT_SEEDS, exporter);
        this.generatePlushieRecipe(PlushieRegistry.DOLPHIN_PLUSHIE, Blocks.LIGHT_BLUE_WOOL, Blocks.CYAN_WOOL, Items.HEART_OF_THE_SEA, exporter);
        this.generatePlushieRecipe(PlushieRegistry.PANDA_PLUSHIE, Blocks.WHITE_WOOL, Blocks.BLACK_WOOL, Items.BAMBOO, exporter);
        this.generatePlushieRecipe(PlushieRegistry.ASAKI_PLUSHIE, Blocks.RED_WOOL, Blocks.BLUE_WOOL, Items.DIAMOND, exporter); // 示例：为 ASAKI_PLUSHIE 设计的合成配方，可根据实际需求修改
        this.generatePlushieRecipe(PlushieRegistry.BLAZE_PLUSHIE, Blocks.ORANGE_WOOL, Blocks.YELLOW_WOOL, Items.BLAZE_POWDER, exporter);
        this.generatePlushieRecipe(PlushieRegistry.BREEZE_PLUSHIE, Blocks.WHITE_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.FEATHER, exporter);
        this.generatePlushieRecipe(PlushieRegistry.CAVE_SPIDER_PLISHIE, Blocks.BLACK_WOOL, Blocks.GRAY_WOOL, Items.SPIDER_EYE, exporter);
        this.generatePlushieRecipe(PlushieRegistry.CANDYCAKE_PLUSHIE, Blocks.PINK_WOOL, Blocks.WHITE_WOOL, Items.SUGAR, exporter);
        this.generatePlushieRecipe(PlushieRegistry.DROWNED_PLUSHIE, Blocks.BLUE_WOOL, Blocks.LIGHT_BLUE_WOOL, Items.TRIDENT, exporter);
        this.generatePlushieRecipe(PlushieRegistry.ELDER_GUARDIAN_PLUSHIE, Blocks.PURPLE_WOOL, Blocks.BLUE_WOOL, Items.PRISMARINE_SHARD, exporter);
        this.generatePlushieRecipe(PlushieRegistry.ENDERDRAGON_PLUSHIE, Blocks.BLACK_WOOL, Blocks.DRAGON_EGG, Items.DRAGON_BREATH, exporter);
        this.generatePlushieRecipe(PlushieRegistry.EVOKER_PLUSHIE, Blocks.PURPLE_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.TOTEM_OF_UNDYING, exporter);
        this.generatePlushieRecipe(PlushieRegistry.GUARDIAN_PLUSHIE, Blocks.LIGHT_BLUE_WOOL, Blocks.CYAN_WOOL, Items.PRISMARINE_CRYSTALS, exporter);
        this.generatePlushieRecipe(PlushieRegistry.HUSK_PLUSHIE, Blocks.SAND, Blocks.DEAD_BUSH, Items.BONE, exporter);
        this.generatePlushieRecipe(PlushieRegistry.MAGMA_CUBE_PLUSHIE, Blocks.MAGMA_BLOCK, Blocks.NETHERRACK, Items.MAGMA_CREAM, exporter);
        this.generatePlushieRecipe(PlushieRegistry.PETER_PLUSHIE, Blocks.LIME_WOOL, Blocks.GREEN_WOOL, Items.APPLE, exporter);
        this.generatePlushieRecipe(PlushieRegistry.PIGLIN_BRUTE_PLUSHIE, Blocks.GOLD_BLOCK, Blocks.NETHERRACK, Items.GOLDEN_SWORD, exporter);
        this.generatePlushieRecipe(PlushieRegistry.PILLAGER_PLUSHIE, Blocks.GRAY_WOOL, Blocks.BLACK_WOOL, Items.CROSSBOW, exporter);
        this.generatePlushieRecipe(PlushieRegistry.RAVANGER_PLUSHIE, Blocks.BLACK_WOOL, Blocks.GRAY_WOOL, Items.IRON_AXE, exporter);
        this.generatePlushieRecipe(PlushieRegistry.SHULKER_PLUSHIE, Blocks.PURPLE_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.SHULKER_SHELL, exporter);
        this.generatePlushieRecipe(PlushieRegistry.SLIME_PLUSHIE, Blocks.SLIME_BLOCK, Blocks.GREEN_WOOL, Items.SLIME_BALL, exporter);
        this.generatePlushieRecipe(PlushieRegistry.STRAY_PLUSHIE, Blocks.WHITE_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.ARROW, exporter);
        this.generatePlushieRecipe(PlushieRegistry.VEX_PLUSHIE, Blocks.BLUE_WOOL, Blocks.LIGHT_BLUE_WOOL, Items.IRON_SWORD, exporter);
        this.generatePlushieRecipe(PlushieRegistry.VINDICATOR_PLUSHIE, Blocks.BROWN_WOOL, Blocks.GRAY_WOOL, Items.IRON_AXE, exporter);
        this.generatePlushieRecipe(PlushieRegistry.WARDEN_PLUSHIE, Blocks.DARK_OAK_PLANKS, Blocks.OBSIDIAN, Items.SCULK_SENSOR, exporter);
        this.generatePlushieRecipe(PlushieRegistry.WITHER_PLUSHIE, Blocks.BLACK_WOOL, Blocks.COAL_BLOCK, Items.NETHER_STAR, exporter);
        this.generatePlushieRecipe(PlushieRegistry.YECHEYYY_PLUSHIE, Blocks.YELLOW_WOOL, Blocks.GOLD_BLOCK, Items.GOLD_NUGGET, exporter);
        this.generatePlushieRecipe(PlushieRegistry.ZOMBIE_VILLAGER_PLUSHIE, Blocks.GREEN_WOOL, Blocks.PURPLE_WOOL, Items.EMERALD, exporter);
        this.generatePlushieRecipe(PlushieRegistry.ZOMBIFIED_PIGLIN_PLUSHIE, Blocks.GOLD_BLOCK, Blocks.NETHERRACK, Items.GOLDEN_SWORD, exporter);
        this.generatePlushieRecipe(PlushieRegistry.ARMADILLO_PLUSHIE, Blocks.BROWN_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.IRON_INGOT, exporter);
        this.generatePlushieRecipe(PlushieRegistry.BAT_PLUSHIE, Blocks.BLACK_WOOL, Blocks.GRAY_WOOL, Items.BAT_SPAWN_EGG, exporter);
        this.generatePlushieRecipe(PlushieRegistry.DONKEY_PLUSHIE, Blocks.BROWN_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.LEAD, exporter);
        this.generatePlushieRecipe(PlushieRegistry.GLOW_SQUID_PLUSHIE, Blocks.LIGHT_BLUE_WOOL, Blocks.GLOWSTONE, Items.GLOW_INK_SAC, exporter);
        this.generatePlushieRecipe(PlushieRegistry.GOAT_PLUSHIE, Blocks.WHITE_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.GOAT_HORN, exporter);
        this.generatePlushieRecipe(PlushieRegistry.IRON_GOLEM_PLUSHIE, Blocks.IRON_BLOCK, Blocks.REDSTONE_BLOCK, Items.IRON_INGOT, exporter);
        this.generatePlushieRecipe(PlushieRegistry.LLAMA_PLUSHIE, Blocks.YELLOW_WOOL, Blocks.BROWN_WOOL, Items.WHITE_CARPET, exporter);
        this.generatePlushieRecipe(PlushieRegistry.MULE_PLUSHIE, Blocks.BROWN_WOOL, Blocks.LIGHT_GRAY_WOOL, Items.CHEST, exporter);
        this.generatePlushieRecipe(PlushieRegistry.POLAR_BEAR_PLUSHIE, Blocks.WHITE_WOOL, Blocks.SNOW_BLOCK, Items.SNOWBALL, exporter);
        this.generatePlushieRecipe(PlushieRegistry.PUFFERFISH_PLUSHIE, Blocks.LIME_WOOL, Blocks.CYAN_WOOL, Items.PUFFERFISH, exporter);
        this.generatePlushieRecipe(PlushieRegistry.SQUID_PLUSHIE, Blocks.BLUE_WOOL, Blocks.LIGHT_BLUE_WOOL, Items.INK_SAC, exporter);
        this.generatePlushieRecipe(PlushieRegistry.STRIDER_PLUSHIE, Blocks.MAGMA_BLOCK, Blocks.NETHERRACK, Items.WARPED_FUNGUS_ON_A_STICK, exporter);
        this.generatePlushieRecipe(PlushieRegistry.TRADER_LAMA_PLUSHIE, Blocks.YELLOW_WOOL, Blocks.BROWN_WOOL, Items.EMERALD, exporter);
        this.generatePlushieRecipe(PlushieRegistry.WANDERING_TRADER_PLUSHIE, Blocks.LIGHT_BLUE_WOOL, Blocks.CYAN_WOOL, Items.EMERALD, exporter);
    }

    private void generatePlushieRecipe(Block outputPlushie, Block primaryWool, Block secondaryWool, Item specialItem, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, outputPlushie).pattern(" # ").pattern("#s#").pattern("i#i").input('#', primaryWool).input('i', secondaryWool).input('s', specialItem).criterion(FabricRecipeProvider.hasItem(primaryWool), FabricRecipeProvider.conditionsFromItem(primaryWool)).criterion(FabricRecipeProvider.hasItem(secondaryWool), FabricRecipeProvider.conditionsFromItem(secondaryWool)).criterion(FabricRecipeProvider.hasItem(specialItem), FabricRecipeProvider.conditionsFromItem(specialItem)).offerTo(exporter);
    }
}
