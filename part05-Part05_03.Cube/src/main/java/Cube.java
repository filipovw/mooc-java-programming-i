public class Cube {
    private final int edgeLength;
    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }
    public int volume() {
        return this.edgeLength*this.edgeLength*this.edgeLength;

    }
    @Override
    public String toString() {
        return("The edge of the length is " + this.edgeLength + " and the volume " + volume());
    }
}
