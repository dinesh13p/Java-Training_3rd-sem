public class OOP_Parametarized{
     public static void main(String[] args){
                 Rectangle rectangle1 = new Rectangle(10,20);
                 
                 System.out.println(rectangle1.area());
                }
}


class Rectangle	{
                 public int length;
                 public int breadth;


public Rectangle(int length, int breadth)
{
this.length = length;
this.breadth = breadth;
}



public int area()
{
	return length*breadth;
}
}