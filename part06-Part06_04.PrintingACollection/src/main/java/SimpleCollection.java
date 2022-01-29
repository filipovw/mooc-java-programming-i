
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

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
    
    @Override
    public String toString() {
        String printOutput;
        if (this.elements.isEmpty()) {
            printOutput = ("The collection " + this.name + " is empty.");
            return printOutput;
        }
        
        if (this.elements.size() == 1) {
            printOutput = ("The collection " + this.name + " has 1 element:");
            for (int i = 0; i < this.elements.size(); i++) {
                printOutput += "\n" + this.elements.get(i);
            }
            return printOutput;
        }
        
        printOutput = ("The collection " + this.name + " has " + this.elements.size() + " elements:");
        for(int i = 0; i < this.elements.size(); i++) {
            printOutput += "\n" + this.elements.get(i);
        }
        return printOutput;
    }
    
}
