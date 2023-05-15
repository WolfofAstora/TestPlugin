package Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sayhello implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // greets the player who issued the command and prints in the console that someone was greeted

        if(sender instanceof Player) {
            sender.sendMessage("Hello hello" + sender.getName());
            Bukkit.getLogger().info("Player was greeted");
            sender.sendMessage("Wurde eingeben: " + command.getName());
        } else {
            sender.sendMessage("You must be a Player!");
        }
        return true;
    }
}
