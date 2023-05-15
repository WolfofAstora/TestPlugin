package Commands.setCommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class setZahl implements CommandExecutor {

    // Global, private variables.
    private Plugin plugin;
    private FileConfiguration config;

    public setZahl(Plugin plugin){
        // Constructor to set plugin and config
        this.plugin = plugin;
        config = plugin.getConfig();
    }
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        // Checks if command is "setzahl" and write the given parameter in the config file
        if(command.getName().equalsIgnoreCase("setzahl")){
            if(args.length == 0){
                return false;
            } else if(args.length == 1){
                config.set("zahl", args[0]);
                sender.sendMessage(config.get("zahl") + " is set");
                plugin.saveConfig();
                return true;
            }
        }
        return false;
    }
}
