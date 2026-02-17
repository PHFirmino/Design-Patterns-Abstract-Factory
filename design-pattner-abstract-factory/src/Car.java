import door.CarDoor;
import door.Door;
import hood.CarHood;
import hood.Hood;
import window.CaWindow;
import window.Window;

public class Car extends AbstractVehicle{
    @Override
    public Door createDoor() {
        return new CarDoor();
    }

    @Override
    public Hood createHood() {
        return new CarHood();
    }

    @Override
    public Window createWindow() {
        return new CaWindow();
    }
}
