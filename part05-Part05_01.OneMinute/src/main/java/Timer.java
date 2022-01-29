    
public class Timer {
    private final ClockHand s;
    private final ClockHand ms;
    
    public Timer() {
        this.s = new ClockHand(60);
        this.ms = new ClockHand(100);
        
        
    }
    public void advance() {
        this.ms.advance();
        
        if(this.ms.value() == 0) {
            this.s.advance();
        }
    }
    @Override
    public String toString() {
        return s + ":" + ms;
    }
    
    
}
