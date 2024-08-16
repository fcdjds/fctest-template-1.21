package com.fc.fctest;

import net.fabricmc.api.ModInitializer;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FcItem {
    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of("fctest", id);
        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
        // Return the registered item!
        return registeredItem;
    }

    static FoodComponent FCTEST_FOOD_COMPONENT;
    public static final Item FCTEST_ITEM=register(new Item(new Item.Settings().food(FCTEST_FOOD_COMPONENT)),"fctest_item");

    public static void initialize(){}
}