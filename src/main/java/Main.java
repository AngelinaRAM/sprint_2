import model.Meat;
import model.Apple;
import model.Food;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {

    public static void main(String[] args) {

        //Мясо в количестве 5 кг по цене 100 рублей за кг
        Meat meat = new Meat(5, 100);

        //Яблоки красные в количестве 10 кг по цене 50 рублей
        Apple redApple = new Apple(10,50, Colour.red);

        //Яблоки зелёные в количестве 8 кг по цене 60 рублей
        Apple greenApple = new Apple(8,60, Colour.green);

        //Создали массив продуктов из этих элементов
        Food[] items = {meat, redApple, greenApple};

        //Проинициализировали корзину с помощью созданного массива
        ShoppingCart shoppingCart = new ShoppingCart(items);

        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getTotalWithoutDiscount() + " руб");
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.getTotalWithDiscount() + " руб");
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + shoppingCart.getTotalVegetarianProducts() + " руб");


    }

}
