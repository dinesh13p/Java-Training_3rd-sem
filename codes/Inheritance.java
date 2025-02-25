class Arithmetic {

    public Arithmetic() {
        this(4, 6);
    }

    public Arithmetic(int a, int b) {

    }

    public void addition(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    public void Multiplication(int a, int b) {
        int product = a * b;
        this.display("Product is: " + product);
    }

    public void display(String res) {
        System.out.println(res);
    }
}

class Addition extends Arithmetic {

    public Addition() {
        super();
    }

    public void addition(int a, int b) {
        int sum = a + b;
        this.display("Sum is: " + sum);
    }

}

public class Inheritance {

    public static void main(String[] args) {
        Addition numbers = new Addition();
        numbers.addition(5, 10);
        // numbers.Multiplication(5, 10);
    }

}
