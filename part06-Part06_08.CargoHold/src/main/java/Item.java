public class Item {
    private final String name;
    private final int weight;
    
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return (this.name + " (" + this.weight + " kg" + ")");
    }
}
