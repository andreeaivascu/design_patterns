public class SquarePegAdapter extends RoundPeg{
    public SquarePeg peg;
  public SquarePegAdapter(SquarePeg peg) {
       super();
       this.peg=peg;

   }

    public SquarePegAdapter(int radius) {
        super(radius);
    }

    public int getRadius()
   {
       return (int) (peg.getWidth()*Math.sqrt(2)/2);
   }





}
