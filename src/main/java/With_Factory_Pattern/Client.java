package With_Factory_Pattern;

import With_Factory_Pattern.Creators.VehicleCreator;
import With_Factory_Pattern.Vehicles.Vehicle;

public class Client {
    private Vehicle vehicle;
    public Client(VehicleCreator creator){
        this.vehicle = creator.createVehicle();
    }

    public Vehicle getVehicle(){
        return vehicle;
    }
}
