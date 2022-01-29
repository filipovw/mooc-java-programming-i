import java.util.*;
public class Stack {
    private ArrayList<String> stack = new ArrayList<>();
    
    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public void add(String value) {
        this.stack.add(0, value);
    }
    
    public ArrayList<String> values() {
        ArrayList<String> values = new ArrayList<>();
        for(int i = 0; i < this.stack.size(); i++) {
            values.add(this.stack.get(i));
        }
        return values;
    }
    
    public String take() {
        String removed = this.stack.get(0);
        this.stack.remove(0);
        return removed;
    }
    
}
