package src.lesson7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SubGen subGen = new SubGen();
        Subscriber[] subscribers = SubGen.generateSubscriberArray();

        List<Subscriber> subscriberList = Arrays.asList(subscribers); // Преобразование массива в список

        SubscriberService subscriberService = new SubscriberServiceImpl(subscriberList);

        List<Subscriber> subscribersWithExceededDuration = subscriberService.getSubscribersWithExceededCityCallDuration(100);
        System.out.println("Абоненты с превышенной продолжительностью внутригородских звонков:");
        for (Subscriber subscriber : subscribersWithExceededDuration) {
            System.out.println(subscriber);
        }

        List<Subscriber> subscribersWithInterCityCalls = subscriberService.getSubscribersWithInterCityCalls();
        System.out.println("Абоненты, которые использовали межгородской звонок:");
        for (Subscriber subscriber : subscribersWithInterCityCalls) {
            System.out.println(subscriber);
        }

        List<Subscriber> subscribersByFirstLetter = subscriberService.getSubscribersByFirstLetterOfLastName('К');
        System.out.println("Абоненты, у которых фамилия начинается с буквы 'К':");
        for (Subscriber subscriber : subscribersByFirstLetter) {
            System.out.println(subscriber);
        }

        int totalTrafficByCity = subscriberService.getTotalInternetTrafficByCity("Киев");
        System.out.println("Суммарное потребление интернет-трафика в городе Киев: " + totalTrafficByCity + " GB");

        int negativeBalanceSubscribersCount = subscriberService.getNegativeBalanceSubscribersCount();
        System.out.println("Количество абонентов с отрицательным балансом: " + negativeBalanceSubscribersCount);
    }
}

