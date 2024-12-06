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
        // Common setup code
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.OG_KUSH.get());
            event.accept(ModItems.SOUR_DIESEL.get());
            event.accept(ModItems.MARS_OG.get());
            event.accept(ModItems.WEDDING_CAKE.get());
            event.accept(ModItems.TRIANGLE_KUSH.get());
            event.accept(ModItems.ANIMAL_MINTS.get());
            event.accept(ModItems.SUNSET_SHERBERT.get());
            event.accept(ModItems.THIN_MINT_COOKIES.get());
            event.accept(ModItems.GELATO.get());
            event.accept(ModItems.COLOMBIAN_GOLD.get());
            event.accept(ModItems.ACAPULCO_GOLD.get());
            event.accept(ModItems.AFGHANI.get());
            event.accept(ModItems.SKUNK.get());
            event.accept(ModItems.PENJAMIN.get());
            event.accept(ModItems.BLUNT.get());
            event.accept(ModItems.JOINT.get());
            event.accept(ModItems.EDIBLE_GUMMY_BEARS.get());
            event.accept(ModItems.EDIBLE_GUMMY_CUBES.get());
            event.accept(ModItems.GROUNDED_WEED.get());
            event.accept(ModItems.GROUNDED_WEED_PURP.get());
            event.accept(ModItems.EDIBLE_BROWNIE.get());
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Server starting code
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Client setup code
        }
    }
}