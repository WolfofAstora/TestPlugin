package Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class testSet implements CommandExecutor {

    private Plugin plugin;
    private FileConfiguration config;
    private int i;
    private int taskId;

    public testSet(Plugin plugin){
        this.plugin = plugin;
        config = plugin.getConfig();
    }

    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(command.getName().equalsIgnoreCase("testset")){
            if(args.length == 0){
                sender.sendMessage(String.valueOf(config.getInt("test")));
                return true;
            }
            if(args.length == 1 && args[0] == "true"){
                activate();
                return true;
            } else if(args.length == 1 && args[0] == "false")
            return true;
        }
        return false;
    }

    private int commandFunction(){
        if(config.contains("test")) {
            int temp = config.getInt("test");
            i++;
        } else{
            config.set("test", i);
        }
        return i;
    }
    protected void activate(){
        config.set("testset", true);
        taskId = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            public void run() {
                commandFunction();
            }
        }, 0L, 100L);
    }
    protected void deactivate(){
        config.set("testset", false);
        Bukkit.getScheduler().cancelTask(taskId);
    }
}
