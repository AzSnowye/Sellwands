package com.artillexstudios.axsellwands.hooks.shop;

import com.epixdevelopment.sellworth.Sell;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SellWorthPricesHook implements PricesHook {

    @Override
    public void setup() {
        // Nothing to setup
    }

    @Override
    public double getPrice(ItemStack it) {
        if (it == null || it.getAmount() == 0) return 0;
        return Sell.getInstance().calculateItemWorth(it);
    }

    @Override
    public double getPrice(Player player, ItemStack it) {
        return getPrice(it);
    }
}
