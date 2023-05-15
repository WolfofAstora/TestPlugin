package Player;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class PlayerInfo implements CommandExecutor {

    // global, private variable
    private Plugin plugin;

    public PlayerInfo(Plugin plugin) { // constructor
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        // prints out some information about the player
        if(command.getName().equalsIgnoreCase("playerinfo")){
            if(sender instanceof Player){
                Player player = (Player) sender;
                sender.sendMessage("Content in Config File: " + plugin.getConfig().get("zahl"));
                sender.sendMessage("Your Position: " + ((Player) sender).getLocale());
                sender.sendMessage("Your Unique ID: " + ((Player) sender).getUniqueId());
                sender.sendMessage("Your Display name: " + ((Player) sender).getDisplayName());
                sender.sendMessage("Command: 'getPlayerListFooter()': " + ((Player) sender).getPlayerListFooter());
                sender.sendMessage("Command: 'getPlayerListHeader()': " + ((Player) sender).getPlayerListHeader());
                sender.sendMessage("Your Adress: " + ((Player) sender).getAddress());
                sender.sendMessage("Your Playtime: " + ((Player) sender).getPlayerTime());
                sender.sendMessage("GetPlayerTimeOffset: " + ((Player) sender).getPlayerTimeOffset());
            } else {
                sender.sendMessage("You must be a Player to execute the command");
                return true;
            }
        }
        return false;
    }
}
