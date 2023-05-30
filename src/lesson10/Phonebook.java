package src.lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List<String>> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    public void add(Entry entry) {
        String name = entry.getName();
        String[] phoneNumbers = entry.getPhoneNumbers();

        List<String> existingPhoneNumbers = phonebook.getOrDefault(name, new ArrayList<>());
        for (String phoneNumber : phoneNumbers) {
            existingPhoneNumbers.add(phoneNumber);
        }
        phonebook.put(name, existingPhoneNumbers);
    }

    public Entry find(String name) {
        if (phonebook.containsKey(name)) {
            String phoneNumber = phonebook.get(name).get(0);
            return new Entry(name, phoneNumber);
        }
        return null;
    }

    public List<Entry> findAll(String name) {
        if (phonebook.containsKey(name)) {
            List<String> phoneNumbers = phonebook.get(name);
            List<Entry> entries = new ArrayList<>();
            for (String phoneNumber : phoneNumbers) {
                entries.add(new Entry(name, phoneNumber));
            }
            return entries;
        }
        return null;
    }
}