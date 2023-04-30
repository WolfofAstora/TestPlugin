import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Level;

public class PluginFirst extends JavaPlugin {

    public void onDisable() {
        super.onDisable();
    }


    public void onEnable() {
        super.onEnable();
        this.getLogger().log(Level.INFO,"First_Plugin successfully loaded!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (command.getName()) {
            case "sayhello":
                sender.sendMessage("Hello hello" + sender.getName());
                Bukkit.getLogger().info("Player was greeted");
                sender.sendMessage("Wurde eingeben: " + command.getName());
                break;
            case "hello":
                sender.sendMessage("HELLO HELLO");
        }
        return true;
    }
}
