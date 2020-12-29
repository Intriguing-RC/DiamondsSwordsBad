package me.intriguing;

import me.intriguing.commands.CheckSpecialDiamondSword;
import me.intriguing.commands.GetSpecialDiamondSword;
import org.bukkit.plugin.java.JavaPlugin;

public class DiamondSword extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("gsds").setExecutor(new GetSpecialDiamondSword());
        this.getCommand("csds").setExecutor(new CheckSpecialDiamondSword());
    }
}
