package src.lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Кефір");
        cat1.setDistance(10);
        cat1.setSwim(0);
        Cat cat2 = new Cat();
        cat2.setName("Зефір");
        cat2.setDistance(20);
        Dog dog1 = new Dog();
        dog1.setName("Бобік");
        dog1.setDistance(100);
        dog1.setSwim(2);
        Dog dog2 = new Dog();
        dog2.setName("Тузик");
        dog2.setDistance(400);
        dog2.setSwim(5);
        Dog dog3 = new Dog();
        dog2.setName("Пончик");
        dog2.setDistance(600);
        dog2.setSwim(12);

        System.out.println("Створено " + Cat.count + " котів");
        System.out.println("Створено " + Dog.count + " собаки");

    }
}
