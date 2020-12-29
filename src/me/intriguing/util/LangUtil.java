package me.intriguing.util;

import org.bukkit.ChatColor;
import java.util.ArrayList;
import java.util.List;

public class LangUtil {

    public static String translate(String pre) {
        return ChatColor.translateAlternateColorCodes('&', pre);
    }

    public static List<String> translate(List<String> pre) {
        List<String> coloredList = new ArrayList<>();
        for(String string : pre) {
            coloredList.add(ChatColor.translateAlternateColorCodes('&', string));
        }

        return coloredList;
    }

}
