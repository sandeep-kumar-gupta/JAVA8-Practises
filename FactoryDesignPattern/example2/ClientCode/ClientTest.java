package FactoryDesignPattern.example2.ClientCode;

import FactoryDesignPattern.example2.ConcreteFactory.ParathaFactory;
import FactoryDesignPattern.example2.ConcreteFactory.PizzaFactory;
import FactoryDesignPattern.example2.FactoryInterface.DishFactory;
import FactoryDesignPattern.example2.ProductInterface.Dish;

public class ClientTest {
    public static void main(String[] args) {


        DishFactory pizzaFactory = new PizzaFactory();
        Dish pizza = pizzaFactory.createDish();
        pizza.prepare();
        pizza.serve();


        DishFactory parthaFactory = new ParathaFactory();
        Dish paratha = parthaFactory.createDish();
        paratha.prepare();
        paratha.serve();
    }
}