package me.megaalex.inncore.utils;

import me.megaalex.inncore.messages.Message;
import me.megaalex.inncore.messages.MessageManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class PlayerUtils {


    public static Player getPlayer(String name) {
        return name == null ? null : Bukkit.getPlayerExact(name);
    }

    public static Player getPlayer(UUID id) {
        return id == null ? null : Bukkit.getPlayer(id);
    }

    public static void sendMessage(UUID playerId, Message type, String... args ) {
        Player player = getPlayer(playerId);

        if(player == null) {
            return;
        }

        MessageManager.sendMsg(player, type, args);
    }

    public static void sendMessage(String playerName, Message type, String... args) {
        Player player = getPlayer(playerName);

        if(player == null) {
            return;
        }

        MessageManager.sendMsg(player, type, args);
    }

    public static String getNameWithPrefix(String player) {
        // TODO: Return the name with a prefix (red or gray? for the race)
        return player;
    }
}