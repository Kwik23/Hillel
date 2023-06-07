package src.lesson13.coffeeOrder;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add("Alen");
        orderBoard.add("Yoda");
        orderBoard.add("Obi-van");
        orderBoard.add("John Snow");
        orderBoard.draw();
        orderBoard.deliver();
        orderBoard.deliver(3);
        orderBoard.draw();

    }
}
