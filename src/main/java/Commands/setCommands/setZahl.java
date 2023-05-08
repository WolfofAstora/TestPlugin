package Commands.setCommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class setZahl implements CommandExecutor {

    private Plugin plugin;
    private FileConfiguration config;

    public setZahl(Plugin plugin){
        this.plugin = plugin;
        config = plugin.getConfig();
    }
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(command.getName().equalsIgnoreCase("setzahl")){
            if(args.length == 0){
                sender.sendMessage("Usage: /setZahl <number>");
                return true;
            } else if(args.length == 1){
                config.set("zahl", args[0]);
                plugin.saveConfig();
            }
        }
        return false;
    }
}
