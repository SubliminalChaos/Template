package me.waqe.plugin.cmds

import me.waqe.plugin.App
import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.event.player.PlayerTeleportEvent

class VersionCmd : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        if (sender !is Player) return false
        if (args.isEmpty()) {
            sender.sendMessage("${ChatColor.DARK_AQUA}Plugin version: MINE!")
            return true
        }
        return true
    }
}