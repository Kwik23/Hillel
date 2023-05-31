package src.lesson11.obstacles;

public class Track implements Obstacle {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
