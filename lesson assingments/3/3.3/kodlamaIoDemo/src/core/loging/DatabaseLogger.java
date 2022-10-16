package core.loging;

public class DatabaseLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("Database loglandi : " + message);
    }
}
