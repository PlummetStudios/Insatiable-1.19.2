package com.plummetstudios.insatiable.common.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SpiderCookie extends Item {


    public SpiderCookie(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack ItemStack, Level worldIn, LivingEntity playerIn) {
        long timeOfDay = worldIn.getDayTime() % 24000;

        if (timeOfDay >= 12000 && timeOfDay <= 23000)
        {
                playerIn.addEffect(new MobEffectInstance(MobEffects.SATURATION, 1, 9));
            }

        else if(worldIn.isThundering())
        {
            playerIn.addEffect(new MobEffectInstance(MobEffects.SATURATION, 1, 9));
        }

        return super.finishUsingItem(ItemStack, worldIn, playerIn);
    }

    @Override
    public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {


    }
}
