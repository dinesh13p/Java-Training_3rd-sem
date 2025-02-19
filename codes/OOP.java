public class OOP{
     public static void main(String[] args){
                 Rectangle rectangle1 = new Rectangle();
                 rectangle1.length = 10;
		 rectangle1.breadth = 20;
                 System.out.println(rectangle1.area());
                }
}


class Rectangle	{
                 public int length;
                 public int breadth;



public int area()
{
	return length*breadth;
}
}