package Schedular;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class CheckPlayerOnlineChecker implements CommandExecutor {

    private Plugin plugin;
    private int taskId;

    public CheckPlayerOnlineChecker(Plugin plugin, int taskId){
        this.plugin = plugin;
        this.taskId = taskId;

    }
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(command.getName().equalsIgnoreCase("CheckPlayerOnlineChecker")){
            
        }

    }
}
