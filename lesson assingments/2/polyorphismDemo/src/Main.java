public class Main {
    public static void main(String[] args) {
//        BaseLogger[] baseLoggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//
//        for (BaseLogger logger : baseLoggers) {
//            logger.Log("Log mesajı");
//        }
        BaseLogger baseLogger = new EmailLogger();

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.update();




    }
}
