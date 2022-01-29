public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
       this.sum = 0;
       this.count = 0;
    }
    
    public void addNumber(int number) {
        this.sum += number;
        this.count++;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        if (!(this.sum == 0)) {
            return this.sum;    
        } 
        return 0;
    }
    
    public double average() {
        if (!(this.count == 0)) {
        return 1.0 * this.sum / this.count;
        } else {
            return 0;
        }
    }
}
