
public class Product {

    private final String name;
    private final String location;
    private final int weight;
    
    public Product(String name) {
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }
    
    public Product(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight = 1;
    }
    
    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.location = "shelf";
    }

    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}
