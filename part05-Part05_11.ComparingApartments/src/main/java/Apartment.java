
public class Apartment {

    private final int rooms;
    private final int squares;
    private final int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }
    
    public int priceDifference(Apartment compared) {
        if(this.squares * this.princePerSquare > compared.squares * compared.princePerSquare) {
            return this.squares * this.princePerSquare - compared.squares * compared.princePerSquare;
        }
        return compared.squares * compared.princePerSquare - this.squares * princePerSquare;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return this.squares * this.princePerSquare > compared.squares * compared.princePerSquare;
           
        
    }

}
