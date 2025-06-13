package fr.glerious.javautils.menu;

import fr.glerious.javautils.BetterItems;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;
import java.util.UUID;

public class Page {

    public Page(UUID uuid, int lineNumber, HashMap<Integer, BetterItems> slots) {
        this.uuid = uuid;
        this.betterItems = slots;
        this.lineNumber = lineNumber;
        this.inventory = Bukkit.createInventory(null, lineNumber * 9, uuid.toString());
    }

    private final UUID uuid;

    private final int lineNumber;

    private final Inventory inventory;

    private final HashMap<Integer, BetterItems> betterItems;

    public UUID getUuid() {
        return uuid;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void plot() {
        for (Integer slot : betterItems.keySet())
            inventory.setItem(slot, betterItems.get(slot).getItemStack());
    }


}
