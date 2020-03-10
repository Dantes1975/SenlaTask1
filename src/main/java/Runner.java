import beans.Backpack;
import beans.Compare;
import beans.Item;
import controller.Checker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Backpack backpack = new Backpack();
		System.out.println("Enter maxWeight");
		int weight = in.nextInt();
		backpack.setMaxWeight(weight);
		System.out.println("Max weight of the backpack is " + backpack.getMaxWeight());

		List<Item> items = new ArrayList<>();
		items.add(new Item("book", 1, 20));
		items.add(new Item("powerbank", 4, 100));
		items.add(new Item("book6", 2, 50));
		items.add(new Item("laptop", 6, 75));

		Checker checker = new Checker();
		System.out.println("Weight of all items is " + checker.getWeightOfItems(items));
		System.out.println("Cost of all items is " + checker.getCostOfItems(items));

		backpack = checker.packBackpack(backpack, items);

		System.out.println("Items in the backpack:");
		for (Item item : backpack.getItems()) {
			System.out.println(item.getName() + " weight is " + item.getWeight() + " cost is " + item.getCost());
		}

		System.out.println("Total weight of items in the backpack " + backpack.getTotalWeightOfItems());
		System.out.println("Total cost of items in the backpack " + backpack.getTotalCostOfItems());

		int[] a = new int[] { 2, 2, 3 };
		int[] b = new int[] { 1, 2, 3 };
		int[] c = Compare.getCompare(a, b);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		int[] d = new int[] { -1, 1, 2, 3, -3 };
		Compare.plusMinus(d);

	}

}
