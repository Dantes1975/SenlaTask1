package controller;

import beans.Backpack;
import beans.Item;

import java.util.ArrayList;
import java.util.List;

public class Checker {

    public int getWeightOfItems(List<Item> items) {
        int weightOfItems = 0;
        for (Item item : items) {
            weightOfItems += item.getWeight();
        }
        return weightOfItems;
    }

    public int getCostOfItems(List<Item> items) {
        int costOfItems = 0;
        for (Item item : items) {
            costOfItems += item.getCost();
        }
        return costOfItems;
    }

    public Backpack packBackpack(Backpack backpack, List<Item> items) {
        int index = items.size();
        int[] weights = new int[index + 1];
        int[] values = new int[index + 1];
        for (int i = 1; i < weights.length; i++) {
            weights[i] = items.get(i - 1).getWeight();
            values[i] = items.get(i - 1).getCost();
        }
        int[][] backPackTable = new int[index + 1][backpack.getMaxWeight() + 1];
        List<Item> takeItems = new ArrayList<>();

        for (int i = 1; i <= items.size(); i++) {
            for (int j = 1; j <= backpack.getMaxWeight(); j++) {
                int itemNotToTake = backPackTable[i - 1][j];
                int itemToTake = 0;
                if (weights[i] <= j) {
                    itemToTake = values[i] + backPackTable[i - 1][j - weights[i]];
                }
                backPackTable[i][j] = Math.max(itemNotToTake, itemToTake);
            }
        }
        for (int n = index, w = backpack.getMaxWeight(); n > 0; n--) {
            if (backPackTable[n][w] != 0 && backPackTable[n][w] != backPackTable[n - 1][w]) {
                takeItems.add(items.get(n - 1));
                w -= weights[n];
            }
        }
        backpack.setItems(takeItems);
        return backpack;
    }


}
