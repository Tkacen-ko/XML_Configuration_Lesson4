package ru.itsjava.services;

import ru.itsjava.domain.Coffee;

public class CoffeeServiceImpl implements CoffeeService {
    private double price;

    public Coffee getCoffeeByPrice(String coffeeType){
        if (coffeeType.equals("Latte")) {
            this.price = 12.50;
            return new Coffee("Latte");
        }
        else if (coffeeType.equals("Cappuccino")) {
            this.price = 15.15;
            return new Coffee("Cappuccino");
        }
        else if (coffeeType.equals("Cocoa")) {
            this.price = 18.11;
            return new Coffee("Cocoa");
        }
        else {
            return new Coffee("?");
        }
    }
    public double getPrice() {
        return price;
    }
}
