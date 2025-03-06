// Parent class
class Parent {
    int x;
    int y;
    int sum;
    
    // Parent class constructor
    Parent(int x, int y) {
        this.x = x;
        this.y = y;
        this.sum = x + y;
    }
}

// Child class inheriting Parent
class child extends Parent {
    child(int x, int d) {
        super(x, d); 
    }
}

// Main class
public class T3_Inheritance {
    public static void main(String[] args) {
        child x1 = new child(500, 1);  
        System.out.println(x1.sum);   
    }
}
