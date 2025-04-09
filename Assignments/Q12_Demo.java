/* 12.	Write a program to demonstrate the use of this keyword. */

class Q12_Demo {	
    private int value;

    public Q12_Demo(int value) {
        this.value = value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void display() {
        System.out.println("Value: " + this.value); 
    }
    public static void main(String[] args) {
        Q12_Demo demo = new Q12_Demo(10);
        demo.display();
        demo.setValue(20);
        demo.display();
    }
}
