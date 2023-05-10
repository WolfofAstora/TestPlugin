package Player;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class argsChecker implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(command.getName().equalsIgnoreCase("argsChecker")){
            if(args.length == 1)
            sender.sendMessage("Data type: " + ((Object)args[0]).getClass().getSimpleName());
            sender.sendMessage(args[0]);
            return true;
        }
        args.toString();
        return false;
    }
}
