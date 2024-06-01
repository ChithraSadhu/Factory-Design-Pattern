package With_Factory_Pattern.Creators;

import With_Factory_Pattern.Vehicles.TwoWheeler;
import With_Factory_Pattern.Vehicles.Vehicle;

public class TwoWheelerCreator implements VehicleCreator{
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
