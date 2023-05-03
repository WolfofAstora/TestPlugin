import Commands.hello;
import Commands.help;
import Commands.sayhello;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Level;

public class PluginFirst extends JavaPlugin {

    public void onDisable() {

        super.onDisable();
        this.getLogger().log(Level.INFO, "First_Plugin couldnt be loaded!");
    }


    public void onEnable() {

        super.onEnable();
        this.getLogger().log(Level.INFO, "First_Plugin successfully loaded!");
        this.getCommand("hello").setExecutor(new hello());
        this.getCommand("sayhello").setExecutor(new sayhello());
    }
}
