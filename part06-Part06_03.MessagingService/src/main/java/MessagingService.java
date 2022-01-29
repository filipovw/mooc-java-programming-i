import java.util.ArrayList;
public class MessagingService {
    private ArrayList<Message> list = new ArrayList<>();
    
    public MessagingService() {
        this.list = new ArrayList<>();
    }
    
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            list.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        ArrayList<Message> getMessages = new ArrayList<>();
        for(int i = 0; i < this.list.size(); i++) {
            getMessages.add(this.list.get(i));
        }
        return getMessages;
    }
}
