public class MainClass {

   public static void main(String args[]) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        System.out.println(hole.fits(rpeg));
        SquarePeg small_sqpeg=new SquarePeg(5);
        SquarePeg large_sqpeg=new SquarePeg(10);
        //hole.fits(small_sqpeg); //need to change the parameter

        SquarePegAdapter small_sqpeg_adapter=new SquarePegAdapter(small_sqpeg);
       SquarePegAdapter large_sqpeg_adapter=new SquarePegAdapter(large_sqpeg);
      System.out.println(hole.fits(small_sqpeg_adapter));
      System.out.println( hole.fits(large_sqpeg_adapter));

    }


}
