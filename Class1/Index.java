public class Index{
	public static void main(String[] args){
		System.out.println("Dinesh Poudel");
		String text = "Nepathya College 2080 batch";
		System.out.println("Dinesh Poudel "+text);
		Student student1 = new Student();
		student1.name = "Dinesh Poudel";
		student1.RollNo = 13;
		student1.marks = 88;
		student1.email = "Dinesh1213@gmail.com";
		student1.displayDetails();
		calculate(40,5);
	}
	static int calculate(int a,int b){		
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
                return 0;		
	}
}
class Student{
	String name;
	int RollNo;
	int marks;
	String email;
	void displayDetails(){
		System.out.println("Name = "+name);
		System.out.println("Roll No."+RollNo);
		System.out.println("Marks = "+ marks);
		System.out.println("Email = "+email);
	}	
}