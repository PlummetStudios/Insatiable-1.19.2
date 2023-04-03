package com.plummetstudios.insatiable.common.item;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.util.LandRandomPos;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.List;
import java.util.Map;

public class ModArmorItem extends ArmorItem {

    public ModArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
                List<Animal> list = player.level.getEntitiesOfClass(Animal.class, player.getBoundingBox().inflate(16, 8, 16));
                for (Animal e : list) {
                    e.setTarget(null);
                    e.setLastHurtByMob(null);
                    Vec3 vec = LandRandomPos.getPosAway(e, 20, 7, player.position());
                    if (vec != null) {
                        e.getNavigation().moveTo(vec.x, vec.y, vec.z, 1.5D);


                    }
                }





                }
            }