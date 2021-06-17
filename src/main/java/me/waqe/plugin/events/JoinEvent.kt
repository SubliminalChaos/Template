package me.waqe.plugin.events

import me.waqe.plugin.App
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.player.PlayerJoinEvent

class JoinEvent(instance: App) : Listener {

    private val plugin = instance

    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent) {
        e.joinMessage = "Welcome To My TEST Server!"
    }
}
