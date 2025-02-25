class Car {

    public void StartEngine() {
        System.out.println("Engine Started");
    }

    public void CloseEngine() {
        System.out.println("Engine Closed");
    }

}

class BMW extends Car {
    public void Engine() {
        super.StartEngine();
        super.CloseEngine();
    }

    // public void CloseEngine() {
    // System.out.println("BMW engine close");
    // }

}

class Toyota extends BMW {

    // public void Engine(){
    // super.StartEngine();
    // super.CloseEngine();
    // }
}

public class CCC {
    public static void main(String[] args) {
        Toyota toyotaCar = new Toyota();
        toyotaCar.StartEngine();
        toyotaCar.CloseEngine();

        BMW bmwCar = new BMW();
        bmwCar.Engine();

    }
}