import java.util.ArrayList;
public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList();
    }
    
    public void addItem(Item item) {
        int totalWeight = 0;
        for(int i = 0; i < items.size(); i++) {
            totalWeight += items.get(i).getWeight();
        }
        if (totalWeight + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for(int i = 0; i < items.size(); i++) {
            totalWeight += items.get(i).getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviest = new Item("", 0);
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }  
        
    @Override
    public String toString() {
        String output;
        int totalWeight = 0;
        for(int i = 0; i < items.size(); i++) {
            totalWeight = totalWeight + items.get(i).getWeight();
        }
        if(items.isEmpty()) {
            output = "no items (0 kg)";
            return output;
        }
        if(items.size() == 1) {
            output = items.size() + " item" + " (" + totalWeight + " kg)";
            return output;
        }
        output = items.size() + " items" + " (" + totalWeight + " kg)";
        return output;
    }
    
}
