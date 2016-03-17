package com.lessoner.treeores;

import net.minecraftforge.fml.common.Mod;

/**
 * Created by anguarmas on 11.02.16.
 */
public class References {
    public static final String MODID = "treeores";
    public static final String VERSION = "1.0"; //TODO: Change this every time
    public static final String NAME = "TreeOres Mod";

    public static final String clientProxy = "com.lessoner.treeores.Proxy.ClientProxy";
    public static final String serverProxy = "com.lessoner.treeores.Proxy.CommonProxy";

    @Mod.Instance(MODID)
    public static TreeOresMod INSTANCE;

}
