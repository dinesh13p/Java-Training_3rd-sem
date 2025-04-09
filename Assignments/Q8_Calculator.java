/* 8.	Define a Calculator class with an overloaded method add(). Implement different versions of add() that handle integers, doubles, and three numbers. */

class Q8_Calculator {
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }
    public int add(int a, int b, int c) { return a + b + c; }

    public static void main(String[] args) {
        Q8_Calculator calc = new Q8_Calculator();
        System.out.println("Int sum: " + calc.add(2, 3));
        System.out.println("Double sum: " + calc.add(2.5, 3.7));
        System.out.println("Three ints sum: " + calc.add(1, 2, 3));
    }
}
