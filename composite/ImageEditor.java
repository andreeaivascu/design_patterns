import java.util.ArrayList;

public class ImageEditor {
   CompoundGraphic all;

    public void load()
    {
        all=new CompoundGraphic();
        all.add(new Dot(1,2));
        all.add(new Circle(5,3,10));


    }

    public void groupSelected(ArrayList<Graphic> components)
    {
        CompoundGraphic group=new CompoundGraphic();
        for (Graphic component :components) {
            group.add(component);
            all.remove(component);
            all.add(group);


        }
        all.draw();
    }
}
