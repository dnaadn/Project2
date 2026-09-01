public class Subscribers extends Passenger{

    public Subscribers(String name, String ID) {
        super(name, ID);
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if(car.getMaxCapacity()==0){
            throw new Exception ("Car has no capacity");
        }
        setReservedCar(car);
        double cost = car.getRoute().getTripPrice()*0.5;
        setTripCost(cost);

        car.setMaxCapacity(car.getMaxCapacity() - 1);
    }

    @Override
    public void displayInfo() {

        System.out.println("-----Subscribers Passengers-----");
        System.out.println("Passenger Name : " + getName());
        System.out.println("Passenger ID : " + getID());
        System.out.println("Car Code : " + getReservedCar().getCode());
        System.out.println("Route Price: " + getReservedCar().getRoute().getTripPrice());
        System.out.println("Trip Cost After 50% Discount : " + getTripCost());

    }
}
