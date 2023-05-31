package src.lesson11.obstacles;

public class Robot implements Participant {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Робот " + name + " біжить");
    }

    public void jump() {
        System.out.println("Робот " + name + " стрибає");
    }

    public boolean overcomeObstacle(Obstacle obstacle) {
        if (obstacle instanceof Track) {
            run();
            Track track = (Track) obstacle;
            if (track.getLength() <= 500) {
                System.out.println("Учасник " + name + " подолав трасу");
                return true;
            } else {
                System.out.println("Учасник " + name + " не подолав трасу");
                return false;
            }
        } else if (obstacle instanceof Wall) {
            jump();
            Wall wall = (Wall) obstacle;
            if (wall.getHeight() <= 3) {
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