import java.util.ArrayList;

class Example {
    String msg;

    Example() {
        msg = "This is a message!";
    }

    @Override
    public String toString() {
        return msg;
    }
}

class Food {
    private String name;
    private int price;

    Food() {
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setPrice(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }
}

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Example ex = new Example();

        list.add("Orange");
        list.add(1);
        list.add("Black");
        list.add(ex);

        boolean isContain = list.contains(ex);
        System.out.println("Does ex object exist in list: " + isContain);
        System.out.println(list);
        list.remove(ex);
        System.out.println(list);
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("brown");

        Food food1 = new Food();
        food1.setName("Mango");
        food1.setPrice(666);
        System.out.println(food1.getName());
        System.out.println(food1.getPrice());

        Food food2 = new Food();
        food2.setName("banana");
        food2.setPrice(345);
        System.out.println(food2.getName());
        System.out.println(food2.getPrice());

    }
}
