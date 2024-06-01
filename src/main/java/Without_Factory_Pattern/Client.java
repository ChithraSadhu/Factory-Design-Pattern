package Without_Factory_Pattern;

public class Client {
    Vehicle vehicle;
    public Client(String vehicle){
        if(vehicle.equals("TwoWheeler")){
            this.vehicle = new TwoWheeler();
        }
        else if(vehicle.equals("FourWheeler")){
            this.vehicle = new FourWheeler();
        }
        else{
            throw new RuntimeException();
        }
    }

    public Vehicle printVehicle(){
        return vehicle;
    }
}
