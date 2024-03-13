package FactoryDesignPattern.example2.ConcreteProduct;

import FactoryDesignPattern.example2.ProductInterface.Dish;

public class Paratha implements Dish {
    @Override
    public void prepare() {
        System.out.println("paratha is preparing");
    }

    @Override
    public void serve() {

        System.out.println("paratah with dahi servering");

    }
}
