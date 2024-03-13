package FactoryDesignPattern.example2.ConcreteFactory;

import FactoryDesignPattern.example2.ConcreteProduct.Pizza;
import FactoryDesignPattern.example2.FactoryInterface.DishFactory;
import FactoryDesignPattern.example2.ProductInterface.Dish;

public class PizzaFactory implements DishFactory {


    @Override
    public Dish createDish() {
        return new Pizza();
    }
}
