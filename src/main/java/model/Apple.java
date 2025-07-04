package model;

import model.constants.Discount;

import static model.constants.Colour.RED;

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
        return RED.equals(colour) ? Discount.DISCOUNT_RED_APPLES : 0.0;
    }

}
