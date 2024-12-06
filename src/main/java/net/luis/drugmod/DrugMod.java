package net.luis.drugmod;

import com.mojang.logging.LogUtils;
import net.luis.drugmod.block.ModBlocks;
import net.luis.drugmod.item.ModCreativeModeTabs;
import net.luis.drugmod.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DrugMod.MOD_ID)
public class DrugMod {
    public static final String MOD_ID = "drugmod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public DrugMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.OG_KUSH);
            event.accept(ModItems.SOUR_DIESEL);
            event.accept(ModItems.MARS_OG);
            event.accept(ModItems.WEDDING_CAKE);
            event.accept(ModItems.TRIANGLE_KUSH);
            event.accept(ModItems.ANIMAL_MINTS);
            event.accept(ModItems.SUNSET_SHERBERT);
            event.accept(ModItems.THIN_MINT_COOKIES);
            event.accept(ModItems.GELATO);
            event.accept(ModItems.COLOMBIAN_GOLD);
            event.accept(ModItems.ACAPULCO_GOLD);
            event.accept(ModItems.AFGHANI);
            event.accept(ModItems.SKUNK);
            event.accept(ModItems.PENJAMIN);
            event.accept(ModItems.BLUNT);
            event.accept(ModItems.JOINT);
            event.accept(ModItems.EDIBLE_GUMMY_BEARS);
            event.accept(ModItems.EDIBLE_GUMMY_CUBES);
            event.accept(ModItems.GROUNDED_WEED);
            event.accept(ModItems.GROUNDED_WEED_PURP);
            event.accept(ModItems.EDIBLE_BROWNIE);
        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}