import Commands.hello;
import Commands.sayhello;
import Commands.setCommands.setZahl;
import Commands.testSet;
import Player.PlayerInfo;
import Player.argsChecker;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Level;

public class PluginFirst extends JavaPlugin {

    public void onDisable() {
        //if the plugin is disabled, then it will be shown in the console

        super.onDisable();
        this.getLogger().log(Level.INFO, "First_Plugin couldnt be loaded!");

    }


    public void onEnable() {
        // if the plugin is successfully loaded, then it saves the config
        // and listen to the command
        super.onEnable();
        saveDefaultConfig();

        this.getLogger().log(Level.INFO, "First_Plugin successfully loaded!");
        this.getCommand("hello").setExecutor(new hello());
        this.getCommand("sayhello").setExecutor(new sayhello());
        this.getCommand("PlayerInfo").setExecutor(new PlayerInfo(this));
        this.getCommand("setZahl").setExecutor(new setZahl(this));
        this.getCommand("testSet").setExecutor(new testSet(this));
        this.getCommand("argsChecker").setExecutor(new argsChecker());
    }
}
