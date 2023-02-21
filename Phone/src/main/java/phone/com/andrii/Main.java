package phone.com.andrii;

public class Main {
    public static void main(String[] args) {
        Phone Nokia = new Phone("3561", "78gr", "nokia");
        Phone Mezu = new Phone("7785", "100gr", "mezu");
        Phone Samsung = new Phone("4589", "87gr", "samsung");
        Phone phone = new Phone();
        Phone vertu = new Phone("55555", "vertu");

        System.out.println(Nokia.number + "  " + Nokia.weight +" "+ Nokia.model);
        System.out.println(Mezu.number + " " + Mezu.weight + " " + Mezu.model);
        System.out.println(Samsung.number + " " + Samsung.weight + " " + Samsung.model);
        System.out.println(vertu.number + " " + phone.model);


        Phone.recieveCall("omg...");
        Phone.recieveCall("biden");
        Phone.recieveCall("Uncle Joe");

        Phone.recieveCall("Bob", "89765447");
        Phone.recieveCall("Telo", "5677");

        Nokia.getNumber();

    }
}
