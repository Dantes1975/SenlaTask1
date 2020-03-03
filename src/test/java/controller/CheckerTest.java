package controller;

import beans.Backpack;
import beans.Item;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckerTest extends TestCase {

    @Test
    public void testGetWeightOfItems() {
        Checker checker = new Checker();
        List<Item> items = new ArrayList<>();
        items.add(new Item("book", 1, 50));
        items.add(new Item("book1", 1, 30));
        items.add(new Item("book2", 2, 150));
        items.add(new Item("book3", 4, 200));
        int rez = checker.getWeightOfItems(items);
        Assert.assertEquals(8, rez);

    }

    @Test
    public void testGetCostOfItems() {
        Checker checker = new Checker();
        List<Item> items = new ArrayList<>();
        items.add(new Item("book", 1, 50));
        items.add(new Item("book1", 1, 30));
        items.add(new Item("book2", 2, 150));
        items.add(new Item("book3", 4, 200));
        int rez = checker.getCostOfItems(items);
        Assert.assertEquals(430, rez);

    }

    public void testPackBackpack() {
        int maxWeight = 6;
        List<Item> takeItems = new ArrayList<>();
        takeItems.add(new Item("book2", 2, 150));
        takeItems.add(new Item("book3", 4, 200));
        Backpack backpack = new Backpack(maxWeight, takeItems);
        Checker checker = new Checker();
        List<Item> items = new ArrayList<>();
        items.add(new Item("book", 1, 50));
        items.add(new Item("book1", 1, 30));
        items.add(new Item("book2", 2, 150));
        items.add(new Item("book3", 4, 200));
        Backpack result = checker.packBackpack(backpack, items);
        Assert.assertEquals(backpack, result);
    }
}