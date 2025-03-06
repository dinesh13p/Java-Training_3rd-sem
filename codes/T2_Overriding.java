public class T2_Overriding {
    
        public void sound() {
            System.out.println("vrumvrumvrum");
        }
    
    public static void main(String[] args) {
        T2_Overriding myVehicle = new T2_Overriding();
        myVehicle.sound();
        
        T2_Overriding myCar = new Bike();
        myCar.sound(); 
    }
}
    
    class Bike extends T2_Overriding {
        // @Override
        public void sound() {
            System.out.println("gudunggudunggudung");
        }
    }
    