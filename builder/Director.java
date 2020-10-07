public class Director {
    private Builder builder;

    private void setBuilder(Builder builder)
    {
        this.builder=builder;
    }

    public void constructSportsCar(Builder builder)
    {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("new engine");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructSUV(Builder builder)
    {

    }



}
