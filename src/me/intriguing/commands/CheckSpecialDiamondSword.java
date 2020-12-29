package me.intriguing.commands;

import de.tr7zw.nbtapi.NBTItem;
import me.intriguing.util.LangUtil;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CheckSpecialDiamondSword implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) return false;
        Player player = (Player) sender;
        ItemStack item = player.getInventory().getItemInMainHand();
        NBTItem nbtItem = new NBTItem(item);
        if (item.getType() == Material.DIAMOND_SWORD) {
            if (nbtItem.getString("color").equals("green")) {
                player.sendMessage(LangUtil.translate("&aHurray! You have a special diamond sword!"));
            } else {
                player.sendMessage(LangUtil.translate("&aSadly, that's not a special one."));
            }
            return true;
        }

        player.sendMessage(LangUtil.translate("&aBruh. You don't even have a diamond sword in your hand!"));
        return true;
    }
    
}
