package With_Factory_Pattern.Creators;

import With_Factory_Pattern.Vehicles.FourWheeler;
import With_Factory_Pattern.Vehicles.Vehicle;

public class FourWheelerCreator implements VehicleCreator{
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
