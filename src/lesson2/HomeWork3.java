package src.lesson2;

import java.util.ArrayList;

public class HomeWork3 {
    private static ArrayList<Double> DepositAmount = new ArrayList<Double>();
    private static double percent;
    private static int period;

    public static void main(String[] args) {

        getData(args);
        calculation();
    }

    private static void getData(String[] argsStringsArray) {
        DepositAmount.add(Double.parseDouble(argsStringsArray[0]));
        System.out.println("Сумма вклада, грн: " + DepositAmount.get(0));
        percent = Double.parseDouble(argsStringsArray[1]);
        System.out.println("Процент: " + percent);
        period = Integer.parseInt(argsStringsArray[2]);
        System.out.println("Продолжительность, лет: " + period);
    }

    private static void calculation() {
        double interestPerMonth = (percent / 12.0) / 100;
        int monthlyAmount = period * 12;

        for (int i = 0; i < monthlyAmount; i++) {
            double profit = DepositAmount.get(i) * interestPerMonth;
            DepositAmount.add(DepositAmount.get(i) + profit);
        }

        for (int i = 1; i <= monthlyAmount; i++) {
            if (i % 12 == 0) {
                double profitInPercent = DepositAmount.get(i) - DepositAmount.get(i - 12);
                double profitInYear = DepositAmount.get(i);
                System.out.printf("Накопления за год, грн: %.2f\n", profitInYear);
                System.out.printf("Процент накопления за год, грн: %.2f\n", profitInPercent);
            }
        }
    }
}


