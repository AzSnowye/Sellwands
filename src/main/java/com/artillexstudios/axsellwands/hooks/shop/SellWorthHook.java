package com.artillexstudios.axsellwands.hooks.shop;

import com.epixdevelopment.sellworth.Sell;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class SellWorthHook {
    private static boolean enabled = false;

    public static void setup() {
        if (Bukkit.getPluginManager().getPlugin("SellWorth") != null) {
            enabled = true;
        }
    }

    public static double getMultiplier(@NotNull Player player, @NotNull ItemStack item) {
        if (!enabled) return 1.0;
        try {
            return Sell.getInstance().getItemMultiplier(player, item);
        } catch (Exception e) {
            return 1.0;
        }
    }

    public static boolean isEnabled() {
        return enabled;
    }
}
