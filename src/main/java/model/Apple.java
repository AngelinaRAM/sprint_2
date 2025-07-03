package model;

import model.constants.Discount;

public class Apple extends Food {

    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = true;
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if ("red".equals(colour)) {
            return Discount.discount60;
        } else {
            return 0.0;
        }
    }

}
