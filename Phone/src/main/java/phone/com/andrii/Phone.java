package phone.com.andrii;

public class Phone {
    public String number, weight, model;

    public Phone() {

    }

    public String getNumber() {
        return number;
    }

    public Phone(String name) {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String weight, String model) {
        this.number = number;
        this.weight = weight;
        this.model = model;

    }

    static void recieveCall(String name) {
        System.out.println("Calling" + " " + name);

    }
    static void recieveCall(String name, String number) {
        System.out.println("Calling" + " " + name + " his number is  " + number);

    }
}
