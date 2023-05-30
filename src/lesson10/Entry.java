package src.lesson10;

public class Entry {
    private String name;
    private String[] phoneNumbers;

    public Entry(String name, String... phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public String[] getPhoneNumbers() {
        return phoneNumbers;
    }
}