package src.lesson4;

public class Car {
    private double volumeOfTheTank;
    private double remainingFuel;
    private double consumptionPer100km;

    public double getVolumeOfTheTank() {
        return this.volumeOfTheTank;
    }

    public void setVolumeOfTheTank(double volume) {
        this.volumeOfTheTank = volume;
    }

    public double getRemainingFuel() {
        return this.remainingFuel;
    }

    public void setRemainingFuel(double leftover) {
        this.remainingFuel = leftover;
    }

    public double getConsumptionPer100km() {
        return this.consumptionPer100km;
    }

    public void setConsumptionPer100km(double consumption) {
        this.consumptionPer100km = consumption;
    }


}

