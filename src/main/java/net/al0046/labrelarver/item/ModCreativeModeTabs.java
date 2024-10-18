package net.al0046.labrelarver.item;

import net.al0046.labrelarver.LabreLarverMod;
import net.al0046.labrelarver.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LabreLarverMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LABRE_LARVER_ITEMS_TAB = CREATIVE_MODE_TABS.register("labre_larver_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LABRE_LARVER.get()))
                    .title(Component.translatable("creativetab.labre_larver_items")) //azurite_items
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.LABRE_LARVER.get());
                        output.accept(ModItems.RAW_LABRE_LARVER.get());

                        output.accept(ModItems.CHAINSAW.get());
                        output.accept(ModItems.ONION.get());
                        output.accept(ModItems.GOLDEN_LABRE_LARVER.get());
                        output.accept(ModItems.DIAMOND_LABRE_LARVER.get());
                        output.accept(ModItems.COLA.get());
                        output.accept(ModItems.CHEESEITEM.get());

                        output.accept(ModItems.AURORA_ASHES.get());
                        output.accept(ModItems.CAPYBARA_SPAWN_EGG.get());

                        output.accept(ModBlocks.LABRE_LARVER_BLOCK.get());

                        output.accept(ModBlocks.LABRE_LARVER_ORE.get());
                        output.accept(ModBlocks.AZURITE_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.AZURITE_END_ORE.get());
                        output.accept(ModBlocks.AZURITE_NETHER_ORE.get());

                        output.accept(ModBlocks.MAGIC_BLOCK.get());

                        output.accept(ModBlocks.AZURITE_STAIRS.get());
                        output.accept(ModBlocks.AZURITE_SLAB.get());

                        output.accept(ModBlocks.AZURITE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.AZURITE_BUTTON.get());

                        output.accept(ModBlocks.AZURITE_FENCE.get());
                        output.accept(ModBlocks.AZURITE_FENCE_GATE.get());
                        output.accept(ModBlocks.AZURITE_WALL.get());

                        output.accept(ModBlocks.AZURITE_DOOR.get());
                        output.accept(ModBlocks.AZURITE_TRAPDOOR.get());
                    }).build());

//    public static final RegistryObject<CreativeModeTab> LABRE_LARVER_BLOCKS_TAB = CREATIVE_MODE_TABS.register("labre_larver_blocks_tab",
//            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.AZURITE_BLOCK.get())).withTabsBefore(LABRE_LARVER_ITEMS_TAB.getId())
//                    .title(Component.translatable("creativetab.labre_larver_blocks")) //azurite_blocks
//                    .displayItems((itemDisplayParameters, output) -> {
//                    }).build());azurite


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
