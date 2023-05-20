package src.lesson7;

public class Subscriber {
    private int id;
    private String lastName;
    private String firstName;
    private String city;
    private String phoneNumber;
    private String contractNumber;
    private double balance;
    private double cityCallDurationMin;
    private double interCityCallDurationMin;
    private double internetTrafficGb;

    public Subscriber(int id, String lastName, String firstName, String city, String phoneNumber,
                      String contractNumber, double balance, double cityCallDurationMin,
                      double interCityCallDurationMin, double internetTrafficGb) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contractNumber = contractNumber;
        this.balance = balance;
        this.cityCallDurationMin = cityCallDurationMin;
        this.interCityCallDurationMin = interCityCallDurationMin;
        this.internetTrafficGb = internetTrafficGb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCityCallDurationMin() {
        return cityCallDurationMin;
    }

    public void setCityCallDurationMin(double cityCallDurationMin) {
        this.cityCallDurationMin = cityCallDurationMin;
    }

    public double getInterCityCallDurationMin() {
        return interCityCallDurationMin;
    }

    public void setInterCityCallDurationMin(double interCityCallDurationMin) {
        this.interCityCallDurationMin = interCityCallDurationMin;
    }

    public double getInternetTrafficGb() {
        return internetTrafficGb;
    }

    public void setInternetTrafficGb(double internetTrafficGb) {
        this.internetTrafficGb = internetTrafficGb;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", balance=" + balance +
                ", cityCallDurationMin=" + cityCallDurationMin +
                ", interCityCallDurationMin=" + interCityCallDurationMin +
                ", internetTrafficGb=" + internetTrafficGb +
                '}';
    }
}
