import door.Door;
import door.VanDoor;
import hood.Hood;
import hood.VanHood;
import window.VanWindow;
import window.Window;

public class Van extends AbstractVehicle{
    @Override
    public Door createDoor() {
        return new VanDoor();
    }

    @Override
    public Hood createHood() {
        return new VanHood();
    }

    @Override
    public Window createWindow() {
        return new VanWindow();
    }
}
