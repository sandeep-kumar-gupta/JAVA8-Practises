package FactoryDesignPattern.factoryClass;

import FactoryDesignPattern.factoryInterface.Computer;
import FactoryDesignPattern.products.ComputerType;
import FactoryDesignPattern.products.Laptop;
import FactoryDesignPattern.products.Pc;
import FactoryDesignPattern.products.Server;

public class ComputerFactory {

    private ComputerFactory(){}

    public static Computer getComputer(ComputerType computerType,String hdd,String cpu,String ram,boolean isGraphicsEnabled,boolean isBlueToothEnabled ){

        switch(computerType){
            case PC :
                return new Pc(hdd,ram,cpu,isGraphicsEnabled,isBlueToothEnabled);
            case LAPTOP:
                return new Laptop(hdd,ram,cpu,isGraphicsEnabled,isBlueToothEnabled);
            case SERVER:
                return new Server(hdd,ram,cpu,isGraphicsEnabled,isBlueToothEnabled);
            default:
                throw new RuntimeException("Invalid Computer type");
        }
    }
}
