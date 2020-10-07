import java.util.ArrayList;

public class CompoundGraphic implements Graphic{
   ArrayList<Graphic> children =new ArrayList<Graphic>();
   public void add(Graphic child)
   {
    children.add(child);
   }

    public void remove (Graphic child)
    {
     children.remove(child);

    }
    @Override
    public void move(int x, int y) {

     for (Graphic child:children) {
      child.move(x,y);
     }

    }

    @Override
    public void draw() {

    System.out.println("Draw component");

    }
}
