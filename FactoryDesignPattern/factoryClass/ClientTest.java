package FactoryDesignPattern.factoryClass;

import FactoryDesignPattern.factoryInterface.Computer;
import FactoryDesignPattern.products.ComputerType;

public class ClientTest {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(ComputerType.PC,"16gb","2.4ghz","120gb",true,true);
        System.out.println("Pc Configuration : "+pc);
        Computer laptop = ComputerFactory.getComputer(ComputerType.LAPTOP,"32gb","2.8ghz","240gb",true,true);
        System.out.println("Laptop Configuration : "+laptop);
        Computer server = ComputerFactory.getComputer(ComputerType.SERVER,"56gb","3ghz","345gb",true,true);
        System.out.println("Server Configuration : "+server);
    }

}
