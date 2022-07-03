package net.lordbreakerx.lordsquestingmod.item;

import net.lordbreakerx.lordsquestingmod.LordsQuestingMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LordsQuestingMod.MOD_ID);

    public static final RegistryObject<Item> VILLAGES_BLESSING = ITEMS.register("villages_blessing",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ADVENTURERS_BLESSING = ITEMS.register("adventurers_blessing",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> BLACKSMITHS_BLESSING = ITEMS.register("blacksmiths_blessing",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> FARMERS_BLESSING = ITEMS.register("farmers_blessing",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> FISHERMENS_BLESSING = ITEMS.register("fishermens_blessing",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> PRIESTS_BLESSING = ITEMS.register("priests_blessing",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SOLDIERS_BLESSING = ITEMS.register("soldiers_blessing",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> TRAVELING_TRADERS_BLESSING = ITEMS.register("traveling_traders_blessing",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> WIZARDS_BLESSING = ITEMS.register("wizards_blessing",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
