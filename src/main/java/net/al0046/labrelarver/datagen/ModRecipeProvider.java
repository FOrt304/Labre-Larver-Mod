package net.al0046.labrelarver.datagen;

import net.al0046.labrelarver.LabreLarverMod;
import net.al0046.labrelarver.block.ModBlocks;
import net.al0046.labrelarver.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> LABRE_LARVER_SMELTABLES = List.of(ModItems.RAW_LABRE_LARVER.get(),
                ModBlocks.LABRE_LARVER_ORE.get(), ModBlocks.AZURITE_DEEPSLATE_ORE.get(), ModBlocks.AZURITE_END_ORE.get(), ModBlocks.AZURITE_NETHER_ORE.get(), ModItems.RAW_LABRE_LARVER.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LABRE_LARVER_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LABRE_LARVER.get())
                .unlockedBy("has_labre_larver", has(ModItems.LABRE_LARVER.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LABRE_LARVER.get(), 9)
                .requires(ModBlocks.LABRE_LARVER_BLOCK.get())
                .unlockedBy("has_labre_larver_block", has(ModBlocks.LABRE_LARVER_BLOCK.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LABRE_LARVER.get(), 9)
                .requires(ModBlocks.MAGIC_BLOCK.get())
                .unlockedBy("has_magic_block", has(ModBlocks.MAGIC_BLOCK.get())).save(recipeOutput, "labrelarver:labre_larver_2");


        oreSmelting(recipeOutput, LABRE_LARVER_SMELTABLES, RecipeCategory.MISC, ModItems.LABRE_LARVER.get(), 0.25f, 200, "labre_larver");
        oreBlasting(recipeOutput, LABRE_LARVER_SMELTABLES, RecipeCategory.MISC, ModItems.LABRE_LARVER.get(), 0.25f, 100, "labre_larver");

        stairBuilder(ModBlocks.AZURITE_STAIRS.get(), Ingredient.of(ModItems.LABRE_LARVER.get())).group("labre_larver")
                        .unlockedBy("has_labre_larver", has(ModItems.LABRE_LARVER.get())).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZURITE_SLAB.get(), ModItems.LABRE_LARVER.get());

        buttonBuilder(ModBlocks.AZURITE_BUTTON.get(), Ingredient.of(ModItems.LABRE_LARVER.get())).group("labre_larver")
                .unlockedBy("has_labre_larver", has(ModItems.LABRE_LARVER.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.AZURITE_PRESSURE_PLATE.get(), ModItems.LABRE_LARVER.get());

        fenceBuilder(ModBlocks.AZURITE_FENCE.get(), Ingredient.of(ModItems.LABRE_LARVER.get())).group("labre_larver")
                .unlockedBy("has_labre_larver", has(ModItems.LABRE_LARVER.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.AZURITE_FENCE_GATE.get(), Ingredient.of(ModItems.LABRE_LARVER.get())).group("labre_larver")
                .unlockedBy("has_labre_larver", has(ModItems.LABRE_LARVER.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZURITE_WALL.get(), ModItems.LABRE_LARVER.get());

        doorBuilder(ModBlocks.AZURITE_DOOR.get(), Ingredient.of(ModItems.LABRE_LARVER.get())).group("labre_larver")
                .unlockedBy("has_labre_larver", has(ModItems.LABRE_LARVER.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.AZURITE_TRAPDOOR.get(), Ingredient.of(ModItems.LABRE_LARVER.get())).group("labre_larver")
                .unlockedBy("has_labre_larver", has(ModItems.LABRE_LARVER.get())).save(recipeOutput);
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, LabreLarverMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
