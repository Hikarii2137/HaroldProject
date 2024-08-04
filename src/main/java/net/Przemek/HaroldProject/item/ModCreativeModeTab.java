package net.Przemek.HaroldProject.item;

import net.Przemek.HaroldProject.HaroldProject;
import net.Przemek.HaroldProject.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
       DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HaroldProject.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FROGGY_TAB = CREATIVE_MODE_TABS.register("froggy_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FROGGY_COOKIE.get()))
                    .title(Component.translatable("creativetab.froggy_tab"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                            output.accept(ModItems.FROGGY_COOKIE.get());
                            output.accept(ModItems.FLY.get());
                            output.accept(ModItems.RAW_FROGIUM.get());
                            output.accept(ModItems.FROGIUM_INGOT.get());
                            output.accept(ModItems.FROGIUM_NUGGET.get());

                            output.accept(ModBlocks.FROGIUM_BLOCK.get());
                            output.accept(ModBlocks.RAW_FROGIUM_BLOCK.get());
                            output.accept(ModBlocks.FROGIUM_ORE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
