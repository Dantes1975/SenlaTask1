package beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Backpack {
    private int maxWeight;
    private List<Item> items;

    public int getTotalCostOfItems() {
        int totalCost = 0;
        for (Item it : items) {
            totalCost += it.getCost();
        }
        return totalCost;
    }

    public int getTotalWeightOfItems() {
        int totalWeight = 0;
        for (Item it : items) {
            totalWeight += it.getWeight();
        }
        return totalWeight;
    }
}
