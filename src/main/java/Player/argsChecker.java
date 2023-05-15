package Player;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class argsChecker implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        // prints out the parameter given with the command

        if(command.getName().equalsIgnoreCase("argsChecker")){
            args.toString();
            if(args.length == 1) {
                sender.sendMessage("Data type: " + ((Object) args[0]).getClass().getSimpleName());
                sender.sendMessage(args[0]);
                return true;
            }
            return true;
        }

        return false;
    }
}
