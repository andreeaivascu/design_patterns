import java.util.Scanner;

public class Application {

   static Dialog dialog;

    public static void initialize() throws Exception {
        Scanner scan=new Scanner(System.in);
        String config=scan.nextLine();
      // String config=readApplicationConfigFile();
        if(config.equals("Windows"))
            dialog=new WindowsDialog();
        else if(config.equals("Web"))
            dialog=new WebDialog();
        else

                throw new Exception("Error! Unknown perating system.");

    }

    //private static String readApplicationConfigFile() {


        //return text;

    //}

    public static void main(String args[]) throws Exception {
        initialize();
        dialog.render();
    }

}
