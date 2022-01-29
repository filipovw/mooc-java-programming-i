import java.util.ArrayList;
public class Hold {
    private final int maxWeight;
    private ArrayList<Suitcase> list = new ArrayList<>();
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (int i = 0; i < list.size(); i++) {
            totalWeight += list.get(i).totalWeight();
        }
        if (totalWeight + suitcase.totalWeight() <= maxWeight) {
            list.add(suitcase);
        }
     }
    
    public void printItems() {
        for(int i = 0; i < list.size(); i++) {
            list.get(i).printItems();
        } 
    }
    
    public String toString() {
        String output;
        int weight = 0;
        output = list.size() + " suitcases";
        for (int i = 0; i < list.size(); i++) {
            weight += list.get(i).totalWeight();
        }
        output += " (" + weight + " kg)";
        return output;
    }
}
