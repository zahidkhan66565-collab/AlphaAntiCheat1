package me.alpha.anticheat;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class AlphaAntiCheat extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§aAlphaAntiCheat Enabled!");
        getServer().getPluginManager().registerEvents(new AntiCheatListener(), this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§cAlphaAntiCheat Disabled!");
    }
}
