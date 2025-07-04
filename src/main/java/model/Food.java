package model;

import model.constants.Discount;

public abstract class Food implements Discountable {

    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    @Override
    public double getDiscount() {
        return Discount.DISCOUNT_RED_APPLES;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

}
