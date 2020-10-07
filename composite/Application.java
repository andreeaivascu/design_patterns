public class Application {

    public static void main(String args[])
    {
        Circle cerc1=new Circle(1,2,3);
        cerc1.move(1,2);
        cerc1.draw();
        CompoundGraphic c=new CompoundGraphic();
        c.add(cerc1);
        c.draw();

    }
}
