public class Main {
    public static void main(String[] args) {
        final String VEHICLE = "van";
        AbstractVehicle abstractVeheicle = null;

        if(VEHICLE.equals("car")){
            abstractVeheicle = new Car();
        } else if (VEHICLE.equals("van")) {
            abstractVeheicle = new Van();
        }

        System.out.println("Door: " + abstractVeheicle.createDoor().getDoor());
        System.out.println("Hood: " + abstractVeheicle.createHood().getHood());
        System.out.println("Window: " + abstractVeheicle.createWindow().getWindow());
    }
}