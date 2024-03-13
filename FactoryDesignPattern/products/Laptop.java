package FactoryDesignPattern.products;

import FactoryDesignPattern.factoryInterface.Computer;

public class Laptop implements Computer {
    private String hdd;
    private String ram;
    private String cpu;

    private boolean isGraphicsEnabled;
    private boolean isBluetoothEnabled;


    public Laptop(String hdd, String ram, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
        this.hdd = hdd;
        this.ram = ram;
        this.cpu = cpu;
        this.isGraphicsEnabled = isGraphicsEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    @Override
    public String ram() {
        return null;
    }

    @Override
    public String hdd() {

        return null;
    }

    @Override
    public String cpu() {

        return null;
    }

    @Override
    public boolean isGraphicsEnabled() {
        return false;
    }

    @Override
    public boolean isBluetoothEnabled() {
        return false;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", isGraphicsEnabled=" + isGraphicsEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
