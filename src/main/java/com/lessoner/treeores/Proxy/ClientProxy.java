package com.lessoner.treeores.Proxy;

import com.lessoner.treeores.Blocks.TreeOresBlocks;
import com.lessoner.treeores.Entities.*;
import com.lessoner.treeores.Events.EventHandler;
import com.lessoner.treeores.Items.TreeOresItems;
import com.lessoner.treeores.Models.ModelBoss;
import com.lessoner.treeores.Renderer.*;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

/**
 * Created by anguarmas on 11.02.16.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit() {
        super.preInit();
        MinecraftForge.EVENT_BUS.register(new EventHandler());
        TreeOresItems.registerVariants();
        TreeOresBlocks.registerVariants();
    }

    @Override
    public void init() {
        TreeOresItems.registerRenders();
        TreeOresBlocks.registerRenders();
        RenderingRegistry.registerEntityRenderingHandler(EntityIronBoss.class, new RendererIronBoss(Minecraft.getMinecraft().getRenderManager() ,new ModelBoss(), 1.0f));
        RenderingRegistry.registerEntityRenderingHandler(EntityGoldBoss.class, new RendererGoldBoss(Minecraft.getMinecraft().getRenderManager() ,new ModelBoss(), 1.0f));
        RenderingRegistry.registerEntityRenderingHandler(EntityCoalBoss.class, new RendererCoalBoss(Minecraft.getMinecraft().getRenderManager() ,new ModelBoss(), 1.0f));
        RenderingRegistry.registerEntityRenderingHandler(EntityRedstoneBoss.class, new RendererRedstoneBoss(Minecraft.getMinecraft().getRenderManager() ,new ModelBoss(), 1.0f));
        RenderingRegistry.registerEntityRenderingHandler(EntityEmeraldBoss.class, new RendererEmeraldBoss(Minecraft.getMinecraft().getRenderManager() ,new ModelBoss(), 1.0f));
        RenderingRegistry.registerEntityRenderingHandler(EntityDiamondBoss.class, new RendererDiamondBoss(Minecraft.getMinecraft().getRenderManager() ,new ModelBoss(), 1.0f));
        RenderingRegistry.registerEntityRenderingHandler(EntityLapisBoss.class, new RendererLapisBoss(Minecraft.getMinecraft().getRenderManager() ,new ModelBoss(), 1.0f));
        RenderingRegistry.registerEntityRenderingHandler(EntityObsidianBoss.class, new RendererObsidianBoss(Minecraft.getMinecraft().getRenderManager() ,new ModelBoss(), 1.0f));
        RenderingRegistry.registerEntityRenderingHandler(EntityGlowstoneBoss.class, new RendererGlowstoneBoss(Minecraft.getMinecraft().getRenderManager() ,new ModelBoss(), 1.0f));
        RenderingRegistry.registerEntityRenderingHandler(EntityQuartzBoss.class, new RendererQuartzBoss(Minecraft.getMinecraft().getRenderManager() ,new ModelBoss(), 1.0f));
        RenderingRegistry.registerEntityRenderingHandler(EntityXpBoss.class, new RendererXpBoss(Minecraft.getMinecraft().getRenderManager() ,new ModelBoss(), 1.0f));
        EntityHandler.registerMonsters(EntityIronBoss.class, "IronTreeBoss", 0);
        EntityHandler.registerMonsters(EntityGoldBoss.class, "GoldTreeBoss", 1);
        EntityHandler.registerMonsters(EntityCoalBoss.class, "CoalTreeBoss", 2);
        EntityHandler.registerMonsters(EntityRedstoneBoss.class, "RedstoneTreeBoss", 3);
        EntityHandler.registerMonsters(EntityEmeraldBoss.class, "EmeraldTreeBoss", 4);
        EntityHandler.registerMonsters(EntityDiamondBoss.class, "DiamondTreeBoss", 5);
        EntityHandler.registerMonsters(EntityLapisBoss.class, "LapisTreeBoss", 6);
        EntityHandler.registerMonsters(EntityObsidianBoss.class, "ObsidianTreeBoss", 7);
        EntityHandler.registerMonsters(EntityGlowstoneBoss.class, "GlowstoneTreeBoss", 8);
        EntityHandler.registerMonsters(EntityQuartzBoss.class, "QuartzTreeBoss", 9);
        EntityHandler.registerMonsters(EntityXpBoss.class, "XpTreeBoss", 10);

    }

}