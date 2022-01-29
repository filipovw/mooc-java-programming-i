import java.util.ArrayList;
public class Package {
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public Package() {
        this.gifts = new ArrayList();
    }
    
    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for(int i = 0; i < this.gifts.size(); i++) {
            totalWeight += this.gifts.get(i).getWeight();
        }
        return totalWeight;
    }
    
}
