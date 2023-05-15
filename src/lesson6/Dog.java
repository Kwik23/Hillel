package src.lesson6;

public class Dog extends Animal {

    static int count = 0;
    private int distance;
    private int swim;

    public void setName(String name) {
        System.out.println("Собаку звати " + name);
        count++;
    }

    @Override
    public void setDistance(int distance) {
        if (distance <= 500) {
            this.distance = distance;
            System.out.println("Собака пробіг " + distance + " м");
        } else {
            System.out.println("Собака не може пробігти більше 500 м");
        }
    }

    @Override
    public void setSwim(int swim) {
        if (swim <= 10) {
            this.swim = swim;
            System.out.println("Собака проплив " + swim + " м");
        } else {
            System.out.println("Собака не може проплисти більше " + swim + " м");
        }
    }
}
