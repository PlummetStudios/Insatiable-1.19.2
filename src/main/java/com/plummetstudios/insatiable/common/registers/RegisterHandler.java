package com.plummetstudios.insatiable.common.registers;


import com.mojang.serialization.Codec;
import com.plummetstudios.insatiable.Insatiable;
import com.plummetstudios.insatiable.loot.LootInjector;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class RegisterHandler {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> GLMS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Insatiable.MOD_ID);
    public static void init() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        GLMS.register(modEventBus);
    }
    private static final RegistryObject<Codec<LootInjector.LootInjectorModifier>> LOOT_INJECTION = GLMS.register("loot_injection", LootInjector.LootInjectorModifier.CODEC);
}
