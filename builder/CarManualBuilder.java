public class CarManualBuilder implements Builder{

    private  Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual=new Manual();

    }

    @Override
    public int setSeats(int x) {
       return x;
    }

    @Override
    public String setEngine(String engine) {
        System.out.println("engine instruction ");
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

    public Manual getProduct()
    {
        return manual;
    }
}
