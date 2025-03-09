class Subject{
    private int math;
    private int science;
    private int english;


public void setMath(int marks){
    this.math = marks;
}

public int getScience(){
    return this.math;
}

public void setScience(int marks){
    this.science = marks;
}

public int getMath(){
    return this.science;
}

public void setEnglish(int marks){
    this.english = marks;
}

public int getEnglish(){
    return this.english;
}
}

public class L5_AccessModifier {

    public static void main(String[] args) {
        Subject subject = new Subject();

        subject.setMath(36);
        subject.setScience(53);
        subject.setEnglish(69);

        System.out.println("Math marks: "+ subject.getMath());
        System.out.println("Science marks: "+ subject.getScience());
        System.out.println("English marks: "+ subject.getEnglish());


    
}
}