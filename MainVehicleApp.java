

public class MainVehicleApp {
    public static void main(String[] args) {
        SUV fortuner = new SUV("Fortuner",false);
        fortuner.move(120, 45);
        fortuner.accelerate(10);
        //fortuner.accelerate(-60);
        System.out.println("Current Gear: "+fortuner.getCurrentGear());
        System.out.println("Current Speed: "+fortuner.getCurrentSpeed());
    }
}
