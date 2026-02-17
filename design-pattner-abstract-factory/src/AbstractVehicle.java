import door.Door;
import hood.Hood;
import window.Window;

public abstract class AbstractVehicle {
    protected abstract Door createDoor();
    protected abstract Hood createHood();
    protected abstract Window createWindow();
}
