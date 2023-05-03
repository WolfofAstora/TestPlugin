package Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class help implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 1 && args[0].equalsIgnoreCase("help")) {
            Player player = (Player) sender;
            player.sendMessage("Welcome to FirstPlugin Help");
            player.sendMessage("/hslfkj fbla bla bla");
            return true;
        }
        return true;
    }
}

