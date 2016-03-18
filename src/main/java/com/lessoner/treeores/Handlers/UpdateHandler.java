package com.lessoner.treeores.Handlers;

import java.io.IOException;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class UpdateHandler {
	private String _downloadUrl = "http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/2242983-treeores-5-5-available-modalicious-update";

	@SubscribeEvent
	public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent e) {
		try {
			CheckUpdates.checkUpdate();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String str = "Download ASAP!!";
		if (CheckUpdates.newversion) {
			e.player.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "<" + "TreeOres Mod" + ">").appendText(EnumChatFormatting.WHITE + " New version out!"));
			IChatComponent localIChatComponent;

			localIChatComponent = IChatComponent.Serializer.jsonToComponent("[{\"text\":\"" + str + "\",\"color\":\"aqua\"}," + "{\"text\":\" " + EnumChatFormatting.WHITE + "[" + EnumChatFormatting.GREEN + "Forum Link" + EnumChatFormatting.WHITE + "]\"," + "\"color\":\"green\",\"hoverEvent\":{\"action\":\"show_text\",\"value\":" + "{\"text\":\"Click this to go to forum thread\",\"color\":\"yellow\"}}," + "\"clickEvent\":{\"action\":\"open_url\",\"value\":\"" + this._downloadUrl  + "\"}}]");
			e.player.addChatMessage(localIChatComponent);
		}
	}
}
