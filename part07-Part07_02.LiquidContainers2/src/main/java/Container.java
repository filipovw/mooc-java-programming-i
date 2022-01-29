public class Container {
    private int l;
    
    public Container() {
        
    }
    
    public int contains() {
        return l;
    }
    
    public void add(int amount) {
        if (amount >= 0 && l + amount <= 100) {
            l += amount;
        } else if(l + amount > 100) {
            l = 100;
        }
    }
    
    public void remove(int amount) {
        if (amount >= 0 && l - amount >= 0) {
            l -= amount;
        } else if (l - amount < 0) {
            l = 0;
        }
    }
    
    @Override
    public String toString() {
        return l + "/100";
    }
}
