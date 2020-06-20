package com.proximyst.silentsend;

import net.md_5.bungee.api.plugin.Plugin;

public final class SilentSendPlugin extends Plugin {
  @Override
  public void onEnable() {
    getProxy().getPluginManager().registerCommand(this, new SilentSendCommand());
  }

  @Override
  public void onDisable() {
    getProxy().getPluginManager().unregisterCommands(this);
  }
}
