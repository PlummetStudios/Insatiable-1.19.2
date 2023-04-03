package com.plummetstudios.insatiable;

import com.plummetstudios.insatiable.common.item.ModBlocks;
import com.plummetstudios.insatiable.common.item.ModItems;
import com.plummetstudios.insatiable.common.registers.RegisterHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("unused")
// The value here should match an entry in the META-INF/mods.toml file
@Mod(Insatiable.MOD_ID)
public class Insatiable
{

    public static final String MOD_ID = "insatiable";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();



    public Insatiable() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(eventBus);
        eventBus.addListener(this::setup);
        RegisterHandler.init();
        ModBlocks.register(eventBus);
        // Register the enqueueIMC method for modloading

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code

    }



}