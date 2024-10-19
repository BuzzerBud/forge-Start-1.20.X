package net.systemhornet.startermod.item;

import net.systemhornet.startermod.StarterMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    private static Object StarterMod;
    //List for Objects (context - Items from mod list)
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, net.systemhornet.startermod.StarterMod.MOD_ID);

public static  final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
        () -> new Item(new Item.Properties()));
public  static final  RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
        () -> new Item(new Item.Properties()));

    //registering Repository for Items
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
