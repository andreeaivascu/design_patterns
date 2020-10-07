import java.io.File;




public class LoggingListener implements EventListener{
    private File log;
    private String message;


    public LoggingListener(String log_filename,String message) {
        this.log = new File(log_filename);
        this.message=message;
    }

    @Override
    public void update(String filename) {
        System.out.println(filename+message);

    }
}
