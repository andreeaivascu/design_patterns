public class Dot implements Graphic{
    int x;
    int y;

    public Dot(int x, int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public void move(int x, int y) {

        this.x=this.x+x;
        this.y=this.y+y;
    }


    @Override
    public void draw() {
       System.out.println("draw a dot X and Y");
    }

}
