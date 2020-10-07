public class EmailAlertsListener implements EventListener{
    private  String message;
    private String email;

    public EmailAlertsListener(String email,String message) {
        this.email = email;
        this.message=message;
    }

    @Override
    public void update(String filename) {
        System.out.println(email+message+filename);

    }
}
