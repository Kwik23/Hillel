package src.lesson11.obstacles;

public class Human implements Participant {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Людина " + name + " біжить");
    }

    public void jump() {
        System.out.println("Людина " + name + " стрибає");
    }

    public boolean overcomeObstacle(Obstacle obstacle) {
        if (obstacle instanceof Track) {
            run();
            Track track = (Track) obstacle;
            if (track.getLength() <= 100) {
                System.out.println("Учасник " + name + " подолав трасу");
                return true;
            } else {
                System.out.println("Учасник " + name + " не подолав трасу");
                return false;
            }
        } else if (obstacle instanceof Wall) {
            jump();
            Wall wall = (Wall) obstacle;
            if (wall.getHeight() <= 2) {
                System.out.println("Учасник " + name + " подолав стіну");
                return true;
            } else {
                System.out.println("Учасник " + name + " не подолав стіни");
                return false;
            }
        }
        return false;
    }
}