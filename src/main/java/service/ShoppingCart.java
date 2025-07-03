package service;
import model.Food;


public class ShoppingCart {

    private Food[] items;

    // Конструктор для инициализации корзины списком товаров
    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    //получить общую сумму товаров в корзине без скидки
    public double getTotalWithoutDiscount() {
        double total = 0;
        for(Food item : items) {
            total += item.getPrice() * item.getAmount();
        }
        return total;
    }

    //получить общую сумму товаров в корзине со скидкой
    public double getTotalWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double discount = item.getDiscount();
            total += item.getPrice() * item.getAmount() * (1 - discount);
        }
        return total;
    }

    //получить общую сумму всех вегетарианских продуктов в корзине без скидки
    public double getTotalVegetarianProducts() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getPrice() * item.getAmount();
            }
        }
        return total;
    }


}
