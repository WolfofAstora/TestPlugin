package Schedular;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.plugin.Plugin;

public class checkIfActive extends BukkitRunnable {

    private Plugin plugin;
    private FileConfiguration config;

    public checkIfActive(Plugin plugin){
        this.plugin = plugin;
        config = plugin.getConfig();
    }

    public void run() {
        plugin.reloadConfig();
    }

    public void startSchedular(){
        runTaskTimer(plugin, 0L, 100L);
    }

    public void stopSchedular(){
        cancel();
    }
    /* Eine Klasse die ein Schedular hat um jede 10 Sekuden prüft ob irgendein anderer Task angestoßen werden sollte*/

}
