public class NonSubscribers extends Passenger{

    private boolean discountCoupon;

    public NonSubscribers(String name, String ID, boolean discountCoupon) {
        super(name, ID);
        this.discountCoupon = discountCoupon;
    }

    public boolean haveDiscountCoupon() {
        return discountCoupon;
    }


    @Override
    public void reserveCar(Car car) throws Exception {
        if(car.getMaxCapacity()==0){
            throw new Exception ("Car has no capacity");
        }
        setReservedCar(car);
        double price = car.getRoute().getTripPrice();
        double cost;

        if(discountCoupon){
            cost = price - (price * 0.1);
        }
        else cost = price;

        setTripCost(cost);

    }

    @Override
    public void displayInfo() {
        System.out.println("-----Non-Subscribers Passengers-----");
        System.out.println("Passenger Name : " + getName());
        System.out.println("Passenger ID : " + getID());
        System.out.println("Car Code : " + getReservedCar().getCode());
        System.out.println("Route Price: " + getReservedCar().getRoute().getTripPrice());
        System.out.println("Trip Cost : " + getTripCost());



    }
}
