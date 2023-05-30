package src.lesson10;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        // Додавання записів
        phonebook.add(new Entry("Олександр", "+380501234567"));
        phonebook.add(new Entry("Марія", "+380502345678"));
        phonebook.add(new Entry("Іван", "+380503456789"));
        phonebook.add(new Entry("Олена", "+380504567890"));
        phonebook.add(new Entry("Петро", "+380505678901"));
        phonebook.add(new Entry("Анна", "+380506789012"));
        phonebook.add(new Entry("Олексій", "+380507890123"));
        phonebook.add(new Entry("Юлія", "+380508901234"));
        phonebook.add(new Entry("Михайло", "+380509012345"));
        phonebook.add(new Entry("Софія", "+380501234567", "+380501112233")); // Запис з декількома номерами
        phonebook.add(new Entry("Олександр", "+380509998877", "+380509999999")); // Запис з декількома номерами

        // Пошук запису за ім'ям
        String searchName = "Олександр";
        Entry foundEntry = phonebook.find(searchName);
        if (foundEntry != null) {
            System.out.println("Запис знайдено: " + foundEntry.getName() + ", " + String.join(", ", foundEntry.getPhoneNumbers()));
        } else {
            System.out.println("Запис не знайдено за ім'ям: " + searchName);
        }

        // Пошук всіх записів за ім'ям
        String searchNameAll = "Олександр";
        List<Entry> foundEntries = phonebook.findAll(searchNameAll);
        if (foundEntries != null) {
            System.out.println("Записи знайдено за ім'ям: " + searchNameAll);
            for (Entry entry : foundEntries) {
                System.out.println(entry.getName() + ", " + String.join(", ", entry.getPhoneNumbers()));
            }
        } else {
            System.out.println("Записи не знайдено за ім'ям: " + searchNameAll);
        }
    }
}