package FactoryDesignPattern.example2.ConcreteProduct;

import FactoryDesignPattern.example2.ProductInterface.Dish;

public class Pizza implements Dish {
    @Override
    public void prepare() {
        System.out.println("pizza is preparing ....");
    }

    @Override
    public void serve() {

        System.out.println("pizza is going to serving");
    }
}
