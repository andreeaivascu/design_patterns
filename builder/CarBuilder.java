public class CarBuilder implements Builder {

    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car=new Car();

    }

    @Override
    public int setSeats(int x) {
       return x;
    }

    @Override
    public String setEngine(String engine) {
        System.out.println("the engine was seted");
        return engine;
    }

    @Override
    public boolean setTripComputer(boolean tripComp) {
         return tripComp;
    }

    @Override
    public boolean setGPS(boolean GPS) {
        return GPS;

    }

    public Car getProduct()
    {
        Car product=this.car;
        this.reset();
        return product;

    }
}
