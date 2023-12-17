public class Vehical {
    public void vehicleColor(){
        System.out.println("RED");
    }
    public void startVehicle(){
        System.out.println("Vehicle Started");
    }
    public void vehicleHorn(){
        System.out.println("pee pee pee!");
    }

}
class Car extends Vehical{
    public void engine(){
        System.out.println("BS6");
    }
}
class Mahindra extends Car{
    public void engine(){
        System.out.println("BS7");
    }
}

