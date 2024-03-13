package FactoryDesignPattern.factoryInterface;

public interface Computer {

    String ram();
    String hdd();
    String cpu();

    boolean isGraphicsEnabled();
    boolean isBluetoothEnabled();


}
