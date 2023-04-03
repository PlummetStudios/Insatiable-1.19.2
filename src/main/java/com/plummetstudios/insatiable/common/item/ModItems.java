package com.plummetstudios.insatiable.common.item;

import com.plummetstudios.insatiable.Insatiable;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
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
    public static final RegistryObject<Item> ANIMAL_PELT = ITEMS.register("animal_pelt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INSATIABLE_TAB)));
    public static final RegistryObject<Item> RAW_GAME_MEAT = ITEMS.register("raw_game_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INSATIABLE_TAB).food(ModFoods.RAW_GAME_MEAT)));

    public static final RegistryObject<Item> COOKED_GAME_MEAT = ITEMS.register("cooked_game_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INSATIABLE_TAB).food(ModFoods.COOKED_GAME_MEAT)));

    public static final RegistryObject<Item> RAW_LIGHT_MEAT = ITEMS.register("raw_light_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INSATIABLE_TAB).food(ModFoods.RAW_LIGHT_MEAT)));

    public static final RegistryObject<Item> COOKED_LIGHT_MEAT = ITEMS.register("cooked_light_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INSATIABLE_TAB).food(ModFoods.COOKED_LIGHT_MEAT)));

    public static final RegistryObject<Item> MEAT_PIE = ITEMS.register("meat_pie",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INSATIABLE_TAB).food(ModFoods.MEAT_PIE)));

    public static final RegistryObject<Item> SUSPICIOUS_PIE = ITEMS.register("suspicious_pie",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INSATIABLE_TAB).food(ModFoods.SUSPICIOUS_PIE)));

    public static final RegistryObject<Item> STRANGE_MEAT = ITEMS.register("strange_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INSATIABLE_TAB).food(ModFoods.STRANGE_MEAT)));

    public static final RegistryObject<Item> BUG_GUTS = ITEMS.register("bug_guts",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.INSATIABLE_TAB).food(ModFoods.BUG_GUTS)));

    public static final RegistryObject<Item> SPIDER_COOKIE = ITEMS.register("spider_cookie",
            () -> new SpiderCookie(new Item.Properties().tab(ModCreativeModeTab.INSATIABLE_TAB)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F).fast().build())));
    public static final RegistryObject<Item> LUNCH_BOX = ITEMS.register("lunch_box",
            () -> new LunchBox(new Item.Properties().tab(ModCreativeModeTab.INSATIABLE_TAB).stacksTo(1)));
    public static final RegistryObject<Item> BUG_STEW = ITEMS.register("bug_stew",
            () -> new BowlFoodItem(new Item.Properties().tab(ModCreativeModeTab.INSATIABLE_TAB).stacksTo(1)
                    .food(new FoodProperties.Builder().nutrition(9).saturationMod(1F).effect(new MobEffectInstance(MobEffects.WEAKNESS, 3000, 0), 0.2F).effect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3000, 0), 0.15F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3000, 0), 0.15F).build())));

    public static final RegistryObject<Item> PELT_HELMET = ITEMS.register("pelt_helmet",
            () -> new ModArmorItem(ModArmorMaterials.PELT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.INSATIABLE_TAB)));

    public static final RegistryObject<Item> PELT_CHESTPLATE = ITEMS.register("pelt_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PELT, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.INSATIABLE_TAB)));

    public static final RegistryObject<Item> PELT_LEGGINGS = ITEMS.register("pelt_leggings",
            () -> new ArmorItem(ModArmorMaterials.PELT, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.INSATIABLE_TAB)));

    public static final RegistryObject<Item> PELT_boots = ITEMS.register("pelt_boots",
            () -> new ArmorItem(ModArmorMaterials.PELT, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.INSATIABLE_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register((eventBus));

    }
}
