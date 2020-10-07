public class Application {

    public static void makeCar()
    {
        Director director =new Director();

        CarBuilder builder1=new CarBuilder();
        director.constructSportsCar(builder1);
        Car car=builder1.getProduct();
        

        CarManualBuilder builder2 = new CarManualBuilder();
        director.constructSportsCar(builder2);
        Manual manual=builder2.getProduct();


    }

    public static void main(String args[])
    {
        makeCar();
    }
}
