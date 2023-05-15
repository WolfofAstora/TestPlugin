package Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import java.util.logging.Level;

public class testSet implements CommandExecutor {

    // Global, private variables
    private Plugin plugin;
    private FileConfiguration config;
    private int i;
    private int taskId;

    public testSet(Plugin plugin){
        // Constructor, writes in the config file

        this.plugin = plugin;
        config = plugin.getConfig();

        config.set("testset", "false");

        if(!config.isSet("test")){
            config.set("test", Integer.toString(i));
        }

    }

    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        // if the parameter is test, the number will be incresed and the last number in the config will be print out
        // if the parameter is true, the shedular will be activeted
        // if the parameter is false, the schedular will be deactiveted

        if(command.getName().equalsIgnoreCase("testset")){
            if(args.length == 1){
                if(args[0].equals("test")) {
                    commandFunction();
                    sender.sendMessage(config.get("test") + " was set");
                    return true;
                } if(args[0].equals("true")){
                    activate();
                    sender.sendMessage("activated");
                    return true;
                } else if(args[0].equals("false")) {
                    deactivate();
                    sender.sendMessage("deactivated");
                    return true;
                }
            }

        }
        return false;
    }

    private void commandFunction(){
        // increase the integer and set the value in the config file
        // saves also written config

            i++;
            config.set("test", Integer.toString(i));
            plugin.saveConfig();
    }
    protected void activate(){

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

    protected void deactivate(){

        // deactivates the scheduler

        config.set("testset", "false");
        Bukkit.getScheduler().cancelTask(taskId);
    }
}
