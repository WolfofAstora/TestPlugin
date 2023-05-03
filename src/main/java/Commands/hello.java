package Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class hello implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage("HELLO HELLO");
        sender.sendMessage("get Effective Permissions " + sender.getEffectivePermissions().toString());
        sender.sendMessage("command.getPermission()): " + command.getPermission());
        return true;
    }
}
