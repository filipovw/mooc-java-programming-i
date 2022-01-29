import java.util.*;
public class Grades {
    ArrayList<Integer> list = new ArrayList();
    
    public Grades() {
        this.list = new ArrayList();
    }
    
    public void add(int grade) {
        list.add(grade);
    }
    
    public int getSize() {
        return list.size();
    }
    
    public double average(Grades grades) {
        double average;
        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        average = sum / list.size();
        return average;
    }
    
    public double pointAveragePassing(Grades grades) {
        double average;
        int count = 0;
        int sum = 0;
        
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) >= 50) {
                sum+= list.get(i);
                count++;
            }
        }
        if(count == 0) {
            return Double.valueOf(count);
        } else {
        average = sum / count;
        return average;
        }
    }
    
    public double passPercentage(Grades grades) {
        int passing = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) >= 50) {
                passing++;
            }
        }
        return 100 * Double.valueOf(passing) / Double.valueOf(list.size());
    }
    
    public String print(int count) {
        String output = "";
        while(count != 0) {
            output += "*";
            count--;
        }
        return output;
    }
    public String gradeDistribution(Grades grades) {
        int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) < 50) {
                count0++;
            } else if(list.get(i) < 60) {
                count1++;
            } else if(list.get(i) < 70) {
                count2++;
            } else if(list.get(i) < 80) {
                count3++;
            } else if(list.get(i) < 90) {
                count4++;
            } else {
                count5++;
            }            
        }
        return "0: " + print(count0) + "\n" + "1: " + print(count1) + "\n" + "2: " + print(count2) + "\n" + "3: " + print(count3) + "\n" + "4: " + print(count4) + "\n" + "5: " + print(count5);
    }
        
}
