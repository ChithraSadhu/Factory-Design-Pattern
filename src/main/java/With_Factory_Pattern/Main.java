package With_Factory_Pattern;

import With_Factory_Pattern.Client;
import With_Factory_Pattern.Creators.FourWheelerCreator;
import With_Factory_Pattern.Vehicles.Vehicle;


public class Main {
    public static void main(String[] args) {
        Client client = new Client(new FourWheelerCreator());
        Vehicle vehicle = client.getVehicle();
        vehicle.printVehicle();
    }
}
