
import java.util.ArrayList;

class Food {
    private String name;
    private double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n{Name: " + name + " Price: " + price + "}";
    }
}

class Menu {
    String category;
    ArrayList<Food> menuItems;

    Menu() {
        menuItems = new ArrayList<>();
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setMenuItems(ArrayList<Food> foods) {
        this.menuItems = foods;
    }

    public String getCatagory() {
        return category;
    }

    public ArrayList<Food> menuItems() {
        return menuItems;
    }

    public void additems(Food food) {
        menuItems.add(food);
    }

    public void display() {
        System.out.println("Category: " + category);
        for (Food food : menuItems) {
            System.out.println(food);
        }
    }

    public void minFoodPrice(){

        System.out.println("Food with minimum amount: ");
    }

    public void maxFoodPrice(){

        System.out.println("Food with maximum amount: ");
    }

}

public class A3_FoodMenuOrder {

    public static void main(String[] args) {

        Menu menu1 = new Menu();
        menu1.setCategory("Dinner");

        menu1.additems(new Food("Chowmin", 180));
        menu1.additems(new Food("Food2", 170));
        menu1.additems(new Food("Food3", 200));
        menu1.additems(new Food("Food4", 150));
        menu1.additems(new Food("Food5", 120));
        menu1.additems(new Food("Food6", 140));
        menu1.additems(new Food("Food7", 100));
        menu1.additems(new Food("Food8", 80));

        menu1.display();
        menu1.minFoodPrice();
        menu1.maxFoodPrice();

    }

}
