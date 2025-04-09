/* Define a class Book with attributes title, author, and price.
Create multiple book objects and display their details using a method.*/

class Q2_Book {
    private String title;
    private String author;
    private double price;

    public Q2_Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class Books {

    public static void main(String[] args) {
        Q2_Book sc = new Q2_Book("Nepali ", "Bishal Lamichhane", 2000000);
        sc.displayDetails();
        System.out.println("---------------------");
        Q2_Book sc1 = new Q2_Book("India", "Niraj Baniya", 10101);
        sc1.displayDetails();
        System.out.println("---------------------");

        Q2_Book sc2 = new Q2_Book("Jay des ", "Dinesh Poudel", 20202);
        sc2.displayDetails();
        System.out.println("---------------------");

    }
}