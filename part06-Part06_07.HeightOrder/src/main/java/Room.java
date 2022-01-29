import java.util.ArrayList;
public class Room {
    ArrayList<Person> list = new ArrayList<>();
    
    public Room() {
        this.list = new ArrayList();
    }
    
    public void add(Person person) {
        this.list.add(person);
    }
    
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        ArrayList<Person> getPersons = new ArrayList<>();
        for(int i = 0; i < this.list.size(); i++) {
            getPersons.add(this.list.get(i));
        }
        return getPersons;
    }
    
    public Person shortest() {
        if(this.list.isEmpty()) {
            return null;
        }
        int shortestHeight = this.list.get(0).getHeight();
        String shortestName = this.list.get(0).getName();
        
        for (int i = 0; i < this.list.size(); i++) {
            if(shortestHeight > this.list.get(i).getHeight()) {
                shortestHeight = this.list.get(i).getHeight();
                shortestName = this.list.get(i).getName();
            }
        }
        Person shortest = new Person(shortestName, shortestHeight);
        return shortest;
        
    }
    
    public Person take() {
        if (this.list.isEmpty()) {
            return null;
        }
        int shortestHeight = this.list.get(0).getHeight();
        String shortestName = this.list.get(0).getName();
        
        for (int i = 0; i < this.list.size(); i++) {
            if(shortestHeight > this.list.get(i).getHeight()) {
                shortestHeight = this.list.get(i).getHeight();
                shortestName = this.list.get(i).getName();
            }
        }
        Person shortest = new Person(shortestName, shortestHeight);
        this.list.remove(shortest);
        return shortest;
    }
}
