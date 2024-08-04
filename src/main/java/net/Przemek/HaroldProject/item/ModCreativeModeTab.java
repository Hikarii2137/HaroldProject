package net.Przemek.HaroldProject.item;

import net.Przemek.HaroldProject.HaroldProject;
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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FROGGYCOOKIE.get()))
                    .title(Component.translatable("creativetab.froggy_tab"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                            output.accept(ModItems.FROGGYCOOKIE.get());
                            output.accept(ModItems.FLY.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
