import java.util.ArrayList;

public class C1_FoodMenu {
    public static void main(String[] args) {

        Menu menu = new Menu();

        Food pizza = new Food("Pizza", 500);
        Food burger = new Food("Burger", 300);
        Food momo = new Food("Momo", 150);

        menu.addFood(pizza);
        menu.addFood(burger);
        menu.addFood(momo);

        System.out.println("Price of Pizza: RS" + menu.getFoodPrice("Pizza"));
        System.out.println("Price of Burger: RS" + menu.getFoodPrice("Burger"));
        System.out.println("Price of Pasta: RS" + menu.getFoodPrice("Pasta"));


        menu.removeFood("burger");
        System.out.println("Price of Burger after removal: RS" + menu.getFoodPrice("Burger"));

    }
}