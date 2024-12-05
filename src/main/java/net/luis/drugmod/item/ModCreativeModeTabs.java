package net.luis.drugmod.item;

import net.luis.drugmod.DrugMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DrugMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DRUGS_TAB = CREATIVE_MODE_TABS.register("drugs_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GELATO.get()))
                    .title(Component.translatable("creativetab.drugs_tab"))
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

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
