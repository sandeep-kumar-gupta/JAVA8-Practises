package BuilderDesignPattern;

public class Laptop {

    private String hdd;
    private String ram;
    private String cpu;

    private boolean isGraphicsEnabled;
    private boolean isBluetoothEnabled;

    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public boolean isGraphicsEnabled() {
        return isGraphicsEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }
private Laptop(LaptopBuilder laptopBuilder){
        this.hdd = laptopBuilder.hdd;
        this.ram = laptopBuilder.ram;
        this.cpu = laptopBuilder.cpu;
        this.isBluetoothEnabled = laptopBuilder.isBluetoothEnabled;
        this.isGraphicsEnabled = laptopBuilder.isGraphicsEnabled;

}
    public static class LaptopBuilder{
        private String hdd;
        private String ram;
        private String cpu;

        private boolean isGraphicsEnabled;
        private boolean isBluetoothEnabled;

        public LaptopBuilder(String hdd, String ram, String cpu) {
            this.hdd = hdd;
            this.ram = ram;
            this.cpu = cpu;
        }

        public LaptopBuilder setGraphicsEnabled(boolean graphicsEnabled) {
            this.isGraphicsEnabled = graphicsEnabled;
            return this;
        }

        public LaptopBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            this.isBluetoothEnabled = bluetoothEnabled;
            return this;
        }
        public Laptop build(){

            return new Laptop(this);
        }
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
