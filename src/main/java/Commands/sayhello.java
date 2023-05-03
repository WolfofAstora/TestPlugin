package Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class sayhello implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        sender.sendMessage("Hello hello" + sender.getName());
        Bukkit.getLogger().info("Player was greeted");
        sender.sendMessage("Wurde eingeben: " + command.getName());
        return true;
    }
}
