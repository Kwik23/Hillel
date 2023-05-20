package src.lesson7;

import java.util.ArrayList;
import java.util.List;

public class SubscriberServiceImpl implements SubscriberService {
    private List<Subscriber> subscribers;

    public SubscriberServiceImpl(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public List<Subscriber> getSubscribersWithExceededCityCallDuration(int duration) {
        List<Subscriber> result = new ArrayList<>();
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCityCallDurationMin() > duration) {
                result.add(subscriber);
            }
        }
        return result;
    }

    @Override
    public List<Subscriber> getSubscribersWithInterCityCalls() {
        List<Subscriber> result = new ArrayList<>();
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getInterCityCallDurationMin() > 0) {
                result.add(subscriber);
            }
        }
        return result;
    }

    @Override
    public List<Subscriber> getSubscribersByFirstLetterOfLastName(char firstLetter) {
        List<Subscriber> result = new ArrayList<>();
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getLastName().charAt(0) == firstLetter) {
                result.add(subscriber);
            }
        }
        return result;
    }

    @Override
    public int getTotalInternetTrafficByCity(String city) {
        int totalTraffic = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCity().equalsIgnoreCase(city)) {
                totalTraffic += subscriber.getInternetTrafficGb();
            }
        }
        return totalTraffic;
    }

    @Override
    public int getNegativeBalanceSubscribersCount() {
        int count = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getBalance() < 0) {
                count++;
            }
        }
        return count;
    }
}
