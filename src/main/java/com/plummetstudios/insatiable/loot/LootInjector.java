package com.plummetstudios.insatiable.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;


import java.util.function.Supplier;

public class LootInjector {

    public static class LootInjectorModifier extends LootModifier {
        public static final Supplier<Codec<LootInjectorModifier>> CODEC = Suppliers.memoize(() -> RecordCodecBuilder.create(inst -> codecStart(inst).and(
                inst.group(
                        ResourceLocation.CODEC.fieldOf("loot_table_id").forGetter(m -> m.table),
                        Codec.BOOL.fieldOf("allow_recursive_glms").forGetter(m -> m.allowRecursiveGlms)
                )).apply(inst, LootInjectorModifier::new)));

        private final boolean allowRecursiveGlms;
        private final ResourceLocation table;
        public LootInjectorModifier(LootItemCondition[] conditionsIn, ResourceLocation tableIn, boolean recursiveGlms) {
            super(conditionsIn);
            this.table = tableIn;
            this.allowRecursiveGlms = recursiveGlms;
        }

        @Override
        protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
            LootContext.Builder builder = (new LootContext.Builder(context.getLevel()).withRandom(context.getRandom()));
            LootTable loottable = context.getLevel().getServer().getLootTables().get(table);
            generatedLoot.addAll(loottable.getRandomItems(builder.create(LootContextParamSets.EMPTY)));
            return generatedLoot;
        }

        @Override
        public Codec<? extends IGlobalLootModifier> codec() {
            return CODEC.get();
        }
    }
}