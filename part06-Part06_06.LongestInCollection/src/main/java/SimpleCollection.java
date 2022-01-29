
import java.util.ArrayList;

public class SimpleCollection {

    private final String name;
    private final ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest() {
        String longest = "";
        if (this.elements.isEmpty()) {
            return null;
        }
        
        for(int i = 0; i < elements.size(); i++) {
            if (this.elements.get(i).length() > longest.length()) {
                longest = this.elements.get(i);
            }
        }
        return longest;
    }

}
