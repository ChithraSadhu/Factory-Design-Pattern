package Without_Factory_Pattern;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("FourWheeler");
        Vehicle vehicle = client.printVehicle();
        vehicle.printVehicle();
    }

}
