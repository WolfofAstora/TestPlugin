package Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import java.util.logging.Level;

public class Welcome implements  {

    private Plugin plugin;
    private FileConfiguration config;
    private int taskId;


    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {



    }

    private void checkIfPlayerJoined(){
            // activates the scheduler.  every 5 seconds the commandFunction() will be triggered
            // and "working" will be written in the console
            config.set("testset", "true");
            taskId = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
                public void run() {
                    commandFunction();
                    plugin.getLogger().log(Level.INFO, "working");
                }
            }, 0L, 100L);
    }
}
