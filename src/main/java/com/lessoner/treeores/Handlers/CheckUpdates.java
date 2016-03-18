package com.lessoner.treeores.Handlers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;
import com.lessoner.treeores.References;

public class CheckUpdates {
	
	public static boolean newversion;
	public static float versionnew = (float) (Float.parseFloat(References.VERSION) + 0.1f);
	
	public static void checkUpdate() throws IOException {
		final URL url = new URL("https://dl.dropboxusercontent.com/u/79165610/TreeOres-1.8.9-" + String.valueOf(versionnew) + ".jar");
		HttpURLConnection huc = (HttpURLConnection) url.openConnection();
		int responseCode = huc.getResponseCode();

		if (responseCode == 200) {
			newversion = true;
		} else {

		}
	}

}
