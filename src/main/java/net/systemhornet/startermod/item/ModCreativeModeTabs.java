package net.systemhornet.startermod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.systemhornet.startermod.StarterMod;

public class ModCreativeModeTabs {

     public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
             DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StarterMod.MOD_ID);


     public static void register(IEventBus eventBus){
         CREATIVE_MODE_TABS.register(eventBus);
     }

}
