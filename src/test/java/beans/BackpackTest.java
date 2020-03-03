package beans;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class BackpackTest extends TestCase {


    public void testGetTotalCostOfItems() {
        int maxWeight = 6;
        List<Item> takeItems = new ArrayList<>();
        takeItems.add(new Item("book2", 2, 150));
        takeItems.add(new Item("book3", 4, 200));
        Backpack backpack = new Backpack(maxWeight, takeItems);
        int rezult = backpack.getTotalCostOfItems();
        Assert.assertEquals(350, rezult);
    }

    public void testGetTotalWeightOfItems() {
        int maxWeight = 6;
        List<Item> takeItems = new ArrayList<>();
        takeItems.add(new Item("book2", 2, 150));
        takeItems.add(new Item("book3", 4, 200));
        Backpack backpack = new Backpack(maxWeight, takeItems);
        int rezult = backpack.getTotalWeightOfItems();
        Assert.assertEquals(6, rezult);
    }
}