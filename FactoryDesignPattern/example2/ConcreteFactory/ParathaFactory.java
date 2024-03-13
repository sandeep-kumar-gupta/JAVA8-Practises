package FactoryDesignPattern.example2.ConcreteFactory;

import FactoryDesignPattern.example2.ConcreteProduct.Paratha;
import FactoryDesignPattern.example2.FactoryInterface.DishFactory;
import FactoryDesignPattern.example2.ProductInterface.Dish;

public class ParathaFactory implements DishFactory {


    @Override
    public Dish createDish() {
        return new Paratha();
    }
}
