import java.util.Scanner;

public class C1_FoodMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter customer phone number: ");
        String customerPhone = scanner.nextLine();
        Customer customer = new Customer(customerName, customerPhone);

        System.out.print("Enter the number of food items: ");
        int n = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < n; i++) {
            System.out.print("Enter food name: ");
            String name = scanner.nextLine();
            System.out.print("Enter price: ");
            int price = scanner.nextInt();
            scanner.nextLine();

            Food food = new Food(name, price);
            menu.addFood(food);
        }

        System.out.print("Enter the name of food to check price: ");
        String searchFood = scanner.nextLine();
        System.out.println("Price of " + searchFood + ": RS" + menu.getFoodPrice(searchFood));


        System.out.print("Enter the name of food to remove: ");
        String removeFood = scanner.nextLine();
        menu.removeFood(removeFood);
        System.out.println("Price of " + removeFood + " after removal: RS" + menu.getFoodPrice(removeFood));

        System.out.println("");
        System.out.println("Customer Details:");
        System.out.println("Name: " + customer.getCustomerName());
        System.out.println("Phone Number: " + customer.getPhoneNumber());

        scanner.close();
    }
}
