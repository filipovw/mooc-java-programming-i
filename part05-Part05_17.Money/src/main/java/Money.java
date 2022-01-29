
public class Money {

    private int euros;
    private int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(euros, cents);
        newMoney.euros += addition.euros;
        newMoney.cents +=addition.cents;
        if(newMoney.cents > 100) {
            newMoney.euros++;
            newMoney.cents = newMoney.cents - 100;
        }
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if(this.euros > compared.euros) {
            return false;
        } else if(this.euros == compared.euros) {
            if(this.cents >= compared.cents) {
                return false;
            }
        }
        return true;
    }
    
    public Money minus(Money decreaser) {
        Money newMoney = new Money(euros, cents);
        if(newMoney.euros - decreaser.euros < 0) {
            newMoney.euros = 0;
            newMoney.cents = 0;
            return newMoney;
        }
        newMoney.euros -= decreaser.euros;
        if (newMoney.cents < decreaser.cents) {
            if(newMoney.euros > 0) {
            newMoney.euros--;
            newMoney.cents = 100 - decreaser.cents;
            } else {
                newMoney.euros = 0;
                newMoney.cents = 0;
            }
            
        } else {
            newMoney.cents -= decreaser.cents;
        }
        
        return newMoney;
        
    }

}
