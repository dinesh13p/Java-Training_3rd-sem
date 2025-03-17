import java.util.ArrayList;

class Menu {
    ArrayList<Food> foodList;

    public Menu() {
        this.foodList = new ArrayList<>();
    }

    public Menu(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }

    public ArrayList<Food> getFoodList() {
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

    public double getFoodPrice(String name) {
        for (Food food : foodList) {
            if (food.getName().equals(name)) {
                return food.getPrice();
            }
        }
        return 0;
    }
}

