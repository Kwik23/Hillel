package src.lesson11.obstacles;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Андрій"),
                new Cat("Том"),
                new Robot("Роб")
        };

        Obstacle[] obstacles = {
                new Track(100),
                new Wall(2),
                new Track(200),
                new Wall(1),
                new Track(500),
                new Wall(3)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!participant.overcomeObstacle(obstacle)) {
                    break;
                }
            }
        }
    }
}