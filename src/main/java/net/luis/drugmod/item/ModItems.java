package net.luis.drugmod.item;

import net.luis.drugmod.DrugMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DrugMod.MOD_ID);

    public static final RegistryObject<Item> OG_KUSH = ITEMS.register("ogkush",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOUR_DIESEL = ITEMS.register("sourdiesel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MARS_OG = ITEMS.register("marsog",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WEDDING_CAKE = ITEMS.register("weddingcake",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRIANGLE_KUSH = ITEMS.register("trianglekush",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANIMAL_MINTS = ITEMS.register("animalmints",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUNSET_SHERBERT = ITEMS.register("sunsetsherbert",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THIN_MINT_COOKIES = ITEMS.register("thinmintcookies",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GELATO = ITEMS.register("gelato",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COLOMBIAN_GOLD = ITEMS.register("colombiangold",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ACAPULCO_GOLD = ITEMS.register("acapulcogold",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AFGHANI = ITEMS.register("afghani",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKUNK = ITEMS.register("skunk",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
