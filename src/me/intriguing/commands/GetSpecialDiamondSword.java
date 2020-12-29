package me.intriguing.commands;

import de.tr7zw.nbtapi.NBTItem;
import me.intriguing.util.LangUtil;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GetSpecialDiamondSword implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) return false;
        Player player = (Player) sender;
        ItemStack diamondSword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = diamondSword.getItemMeta();
        meta.setDisplayName(LangUtil.translate("&6&lSUPERIOR &e&lDIAMONDSWORD"));
        meta.setLore(
                LangUtil.translate(
                        new ArrayList<String>() {
                            {
                                add("&r");
                                add("&bThis is a very cool");
                                add("&bDiamond Sword");
                                add("&r");
                            }
                        }
                )
        );

        diamondSword.setItemMeta(meta);
        NBTItem item = new NBTItem(diamondSword);
        item.setString("color", "green");
        player.getInventory().addItem(item.getItem());
        return true;
    }
}
