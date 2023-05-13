package Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import java.util.logging.Level;

public class testSet implements CommandExecutor {

    private Plugin plugin;
    private FileConfiguration config;
    private int i;
    private int taskId;

    public testSet(Plugin plugin){
        this.plugin = plugin;
        config = plugin.getConfig();

        config.set("testset", "false");

        if(!config.isSet("test")){
            config.set("test", Integer.toString(i));
        }

    }

    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
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
            i++;
            config.set("test", Integer.toString(i));
            plugin.saveConfig();
    }
    protected void activate(){
        config.set("testset", "true");
        taskId = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                commandFunction();
                plugin.getLogger().log(Level.INFO, "working");
            }
        }, 0L, 100L);
    }

    protected void deactivate(){
        config.set("testset", "false");
        Bukkit.getScheduler().cancelTask(taskId);
    }
}
