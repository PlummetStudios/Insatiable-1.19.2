package com.plummetstudios.insatiable.common.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RAW_GAME_MEAT = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.4F).effect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 300, 5), 1F).meat().build();
    public static final FoodProperties COOKED_GAME_MEAT = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).meat().build();

    public static final FoodProperties RAW_LIGHT_MEAT = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.4F).effect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 90, 0), 1F).effect(new MobEffectInstance(MobEffects.CONFUSION, 300, 5), 1F).effect(new MobEffectInstance(MobEffects.POISON, 20, 3), 1F).meat().build();
    public static final FoodProperties COOKED_LIGHT_MEAT = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.5F).meat().build();

    public static final FoodProperties BUG_GUTS = (new FoodProperties.Builder()).nutrition(4).saturationMod(1F).meat().fast().build();

    public static final FoodProperties STRANGE_MEAT = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.4F).effect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 5000, 0), 1F).effect(new MobEffectInstance(MobEffects.CONFUSION, 300, 5), 1F).effect(new MobEffectInstance(MobEffects.POISON, 1000, 3), 1F).effect(new MobEffectInstance(MobEffects.POISON, 100, 3), 1F).meat().build();

    public static final FoodProperties MEAT_PIE = (new FoodProperties.Builder()).nutrition(8).saturationMod(1F).meat().build();




}
