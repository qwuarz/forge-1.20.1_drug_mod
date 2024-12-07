package net.qwuarz.drugmod.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemNameBlockItem;
import net.qwuarz.drugmod.DrugMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.qwuarz.drugmod.block.ModBlocks;
import net.qwuarz.drugmod.item.custom.JointItem;
import net.qwuarz.drugmod.item.custom.BluntItem;



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
    public static final RegistryObject<Item> PENJAMIN = ITEMS.register("penjamin",
            () -> new PenjaminItem(new Item.Properties().stacksTo(1).durability(100)));
    public static final RegistryObject<Item> BLUNT = ITEMS.register("blunt",
            () -> new BluntItem(new Item.Properties()));
    public static final RegistryObject<Item> JOINT = ITEMS.register("joint",
            () -> new JointItem(new Item.Properties()));
    public static final RegistryObject<Item> EDIBLE_GUMMY_BEARS = ITEMS.register("ediblegummybears",
            () -> new Item(new Item.Properties().food(ModFoods.EDIBLE_GUMMY_BEARS)));
    public static final RegistryObject<Item> EDIBLE_GUMMY_CUBES = ITEMS.register("ediblegummycubes",
            () -> new Item(new Item.Properties().food(ModFoods.EDIBLE_GUMMY_CUBES)));
    public static final RegistryObject<Item> EDIBLE_BROWNIE = ITEMS.register("ediblebrownie",
            () -> new Item(new Item.Properties().food(ModFoods.EDIBLE_BROWNIE)));
    public static final RegistryObject<Item> CANNABIS_WAX = ITEMS.register("cannabiswax",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMPTY_CART = ITEMS.register("emptycart",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FULL_CART = ITEMS.register("fullcart",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PENJAMIN_BATTERY = ITEMS.register("penjaminbattery",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PAPERS = ITEMS.register("rawpapers",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUNT_WRAPS = ITEMS.register("bluntwraps",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WEED_SEED = ITEMS.register("weed_seed",
            () -> new ItemNameBlockItem(ModBlocks.WEED_CROP.get(), new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}