package com.frostsmp.api;

import org.bukkit.entity.Player;

/**
 * Public API for other plugins to read/modify a player's Strength level.
 */
public interface StrengthAPI {

    int getStrength(Player player);
    void setStrength(Player player, int amount);
    void modifyStrength(Player player, int amount);
}
