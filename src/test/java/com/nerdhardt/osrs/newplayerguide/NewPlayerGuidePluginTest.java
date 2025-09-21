package com.nerdhardt.osrs.newplayerguide;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class NewPlayerGuidePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(NewPlayerGuidePlugin.class);
		RuneLite.main(args);
	}
}