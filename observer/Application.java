public class Application {
    public static void main(String[] args){
        Editor editor = new Editor();

        LoggingListener logger = new LoggingListener(
                "/path/to/log.txt",
                "Someone has opened the file: %s");
        editor.events.subscribe("open", "logger");

        EmailAlertsListener emailAlerts = new EmailAlertsListener(
                "admin@example.com",
                "Someone has changed the file: %s");
        editor.events.subscribe("save", "emailAlerts");
    }
}
