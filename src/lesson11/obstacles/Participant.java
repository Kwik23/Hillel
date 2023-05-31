package src.lesson11.obstacles;

public interface Participant {
    void run();
    void jump();
    boolean overcomeObstacle(Obstacle obstacle);
}
