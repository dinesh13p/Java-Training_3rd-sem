import java.util.ArrayList;

class Menu {
    ArrayList<Food> foodList;

    public Menu() {
        this.foodList = new ArrayList<>();
        ArrayList<Food> foodList = new ArrayList<>();
    }

    public Menu(ArrayList<Food> foodlList) {
        this.foodList = foodList;
    }

    public ArrayList<Food> getfoodList() {
        return this.foodList;
    }

    public void addFood(Food food) {
        this.foodList.add(food);
    }

    public void removeFood(String name) {
        for (Food food : foodList) {
            if (food.getName().equals(name)) {
                foodList.remove(food);
                break;
            }
        }
    }
}
