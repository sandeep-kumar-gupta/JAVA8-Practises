package BuilderDesignPattern;

public class ClientTest {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop.LaptopBuilder("200gb","8gb","2.4ghz").build();
        System.out.println("Laptop Configuration : "+laptop1);

        Laptop laptop2 = new Laptop.LaptopBuilder("200gb","8gb","2.4ghz").setBluetoothEnabled(true).setGraphicsEnabled(false).build();
        System.out.println("Laptop Configuration : "+laptop2);
    }
}
