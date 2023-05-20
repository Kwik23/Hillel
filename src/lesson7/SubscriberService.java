package src.lesson7;

import java.util.List;

public interface SubscriberService {
    List<Subscriber> getSubscribersWithExceededCityCallDuration(int duration);

    List<Subscriber> getSubscribersWithInterCityCalls();

    List<Subscriber> getSubscribersByFirstLetterOfLastName(char firstLetter);

    int getTotalInternetTrafficByCity(String city);

    int getNegativeBalanceSubscribersCount();
}
