package com.plummetstudios.insatiable.common.item;

import com.plummetstudios.insatiable.Insatiable;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Insatiable.MOD_ID);

    public static final RegistryObject<Item> RAW_GAME_MEAT = ITEMS.register("raw_game_meat",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.RAW_GAME_MEAT)));

    public static final RegistryObject<Item> COOKED_GAME_MEAT = ITEMS.register("cooked_game_meat",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.COOKED_GAME_MEAT)));

    public static final RegistryObject<Item> RAW_LIGHT_MEAT = ITEMS.register("raw_light_meat",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.RAW_LIGHT_MEAT)));

    public static final RegistryObject<Item> COOKED_LIGHT_MEAT = ITEMS.register("cooked_light_meat",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.COOKED_LIGHT_MEAT)));

    public static final RegistryObject<Item> MEAT_PIE = ITEMS.register("meat_pie",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.MEAT_PIE)));

    public static final RegistryObject<Item> STRANGE_MEAT = ITEMS.register("strange_meat",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.STRANGE_MEAT)));

    public static final RegistryObject<Item> BUG_GUTS = ITEMS.register("bug_guts",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.BUG_GUTS)));

    public static final RegistryObject<Item> SPIDER_COOKIE = ITEMS.register("spider_cookie",
            () -> new SpiderCookie(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F).fast().build())));

    public static final RegistryObject<Item> BUG_STEW = ITEMS.register("bug_stew",
            () -> new BowlFoodItem(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(1)
                    .food(new FoodProperties.Builder().nutrition(9).saturationMod(1F).effect(new MobEffectInstance(MobEffects.WEAKNESS, 3000, 0), 0.2F).effect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3000, 0), 0.15F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3000, 0), 0.15F).build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register((eventBus));

    }
}
