interface Rentable {
    public void calculateRent(int hours);  
}
class Car implements Rentable{
    @Override
    public void calculateRent(int hours){
        System.out.println("Car rent: "+hours*560);
    }
}
class Bike implements Rentable{
    @Override
    public void calculateRent(int hours){
        System.out.println("Bike rent: "+hours*350);
    }
}
class Truck implements Rentable{
    @Override
    public void calculateRent(int hours){
        System.out.println("Truck rent: "+hours*1000);
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car c = new Car();
        c.calculateRent(3);
        Bike b = new Bike();
        b.calculateRent(4);
        Truck t = new Truck();
        t.calculateRent(2);
    }
    
}
