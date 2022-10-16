package core.loging;

public class EMailLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("E-Mail loglandi : " + message);
    }
}
