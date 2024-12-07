package net.qwuarz.drugmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.qwuarz.drugmod.DrugMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DrugMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DRUGS_TAB = CREATIVE_MOD_TABS.register("drugmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OG_KUSH.get()))
                    .title(Component.translatable("creativetab.drugmod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.OG_KUSH.get());
                        pOutput.accept(ModItems.SOUR_DIESEL.get());
                        pOutput.accept(ModItems.MARS_OG.get());
                        pOutput.accept(ModItems.WEDDING_CAKE.get());
                        pOutput.accept(ModItems.TRIANGLE_KUSH.get());
                        pOutput.accept(ModItems.ANIMAL_MINTS.get());
                        pOutput.accept(ModItems.SUNSET_SHERBERT.get());
                        pOutput.accept(ModItems.THIN_MINT_COOKIES.get());
                        pOutput.accept(ModItems.GELATO.get());
                        pOutput.accept(ModItems.COLOMBIAN_GOLD.get());
                        pOutput.accept(ModItems.ACAPULCO_GOLD.get());
                        pOutput.accept(ModItems.AFGHANI.get());
                        pOutput.accept(ModItems.SKUNK.get());
                        pOutput.accept(ModItems.PENJAMIN.get());
                        pOutput.accept(ModItems.BLUNT.get());
                        pOutput.accept(ModItems.JOINT.get());
                        pOutput.accept(ModItems.EDIBLE_GUMMY_BEARS.get());
                        pOutput.accept(ModItems.EDIBLE_GUMMY_CUBES.get());
                        pOutput.accept(ModItems.EDIBLE_BROWNIE.get());
                        pOutput.accept(ModItems.CANNABIS_WAX.get());
                        pOutput.accept(ModItems.EMPTY_CART.get());
                        pOutput.accept(ModItems.FULL_CART.get());
                        pOutput.accept(ModItems.PENJAMIN_BATTERY.get());
                        pOutput.accept(ModItems.RAW_PAPERS.get());
                        pOutput.accept(ModItems.BLUNT_WRAPS.get());
                        pOutput.accept(ModItems.WEED_SEED.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}