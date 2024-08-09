package net.Hikarii2137.HaroldProject.item;

import net.Hikarii2137.HaroldProject.HaroldProject;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HaroldProject.MOD_ID);

    public static final RegistryObject<Item> FROGGY_COOKIE = ITEMS.register("froggy_cookie",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FLY = ITEMS.register("fly",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_FROGIUM = ITEMS.register("raw_frogium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FROGIUM_INGOT = ITEMS.register("frogium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FROGIUM_NUGGET = ITEMS.register("frogium_nugget",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
