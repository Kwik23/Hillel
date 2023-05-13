package src.lesson4;


public class Main {
    static int[] distance = {179, 153, 148};


    public static void main(String[] args) {
        Car car = new Car();
        car.setVolumeOfTheTank(50);
        car.setRemainingFuel(20);
        car.setConsumptionPer100km(10);
        double allFuelUsed = fuelCalc(car);
        printResult(allFuelUsed, costCalc(allFuelUsed), remainingFuelCalc(car));

    }

    public static double fuelCalc(Car car) {

        double fuelUsed = 0;
        for (int element:distance) {
            fuelUsed += car.getConsumptionPer100km() * element / 100;
        }
        return fuelUsed;

    }

    public static double costCalc(double fuelUsed) {
        double fuelPriceValue = 47;
        return fuelUsed * fuelPriceValue;
    }

    public static double remainingFuelCalc(Car car) {
        return car.getConsumptionPer100km() * distance[distance.length - 1] / 100;

    }

    public static void printResult(double allFuelUsed, double cost, double remainingFuelCalc) {

        System.out.println("For a trip from Odessa to Kyiv with two stops (to Krivoye Ozero and to Zhashkiv) necessary fuel, l: " + allFuelUsed);
        System.out.println("While the cost of fuel, UAH: " + cost);
        System.out.println("Remaining fuel at the end of the journey, l: " + remainingFuelCalc);
    }
}
