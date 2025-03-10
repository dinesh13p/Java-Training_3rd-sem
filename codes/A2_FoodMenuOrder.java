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


class Menu{
    String category;
    ArrayList<Food> menuItems;

    Menu(){
        menuItems = new ArrayList<>();
    }

    public void setCategory(String category){
         this.category= category;
    }

    public void setMenuItems(ArrayList<Food> foods){
        this.menuItems = foods;
    }

    public String getCatagory(){
        return category;
    }

    public ArrayList<Food> menuItems(){
        return menuItems;
    }

}

public class A2_FoodMenuOrder {

    public static void main(String[] args) {

        ArrayList<Food> list = new ArrayList<>(5);

        list.add(new Food("Momo", 180));
        list.add(new Food("Chowmin", 150));
        list.add(new Food("Samosa", 100));
        list.add(new Food("Doughnut", 80));
        list.add(new Food("Rice", 150));

        double total = 0;
        for (Food food : list) {
            System.out.println(food);
            total = total + food.getPrice();
        }
        System.out.println("Total Price: "+ total);

    }

}
