package mrtjp.projectred.core

import net.minecraftforge.fml.event.lifecycle.{FMLClientSetupEvent, FMLCommonSetupEvent, FMLDedicatedServerSetupEvent, FMLLoadCompleteEvent}

trait IProxy {

    def construct(): Unit = {
    }

    def commonSetup(event: FMLCommonSetupEvent): Unit = {}

    def clientSetup(event: FMLClientSetupEvent): Unit = {}

    def serverSetup(event: FMLDedicatedServerSetupEvent): Unit = {}

    def loadComplete(event: FMLLoadCompleteEvent): Unit = {}
}
