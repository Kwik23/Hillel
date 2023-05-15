package src.lesson6;

public class Cat extends Animal {

    static int count = 0;
    private int distance;

    public void setName(String name) {
        System.out.println("Кота звати " + name);
        count++;
    }

    @Override
    public void setDistance(int distance) {
        if (distance <= 200) {
            this.distance = distance;
            System.out.println("Кіт пробіг " + distance + " м");
        } else {
            System.out.println("Кіт не може пробігти більше 200 м");
        }
    }

    @Override
    public void setSwim(int swim) {
        System.out.println("Коти не вміють плавати");
    }

}
