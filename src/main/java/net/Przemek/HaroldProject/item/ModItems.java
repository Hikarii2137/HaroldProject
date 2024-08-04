package net.Przemek.HaroldProject.item;

import net.Przemek.HaroldProject.HaroldProject;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HaroldProject.MOD_ID);

    public static final RegistryObject<Item> FROGGYCOOKIE = ITEMS.register("froggycookie",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FLY = ITEMS.register("fly",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
