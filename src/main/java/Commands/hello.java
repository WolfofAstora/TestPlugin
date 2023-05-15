package Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class hello implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Prints out the effective permissions of the player
        if(command.getName().equalsIgnoreCase("hello")){
            if(sender instanceof Player){ // can only be issued as a player
            sender.sendMessage("HELLO HELLO");
            sender.sendMessage("get Effective Permissions " + sender.getEffectivePermissions());
            sender.sendMessage("command.getPermission()): " + command.getPermission());
            return true;
            } else {
                sender.sendMessage("You must be a Player!");
            }
        }
        return false;
    }
}
