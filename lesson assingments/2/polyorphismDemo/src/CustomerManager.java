public class CustomerManager {
    private BaseLogger logger;
    private String name;

    public CustomerManager(BaseLogger logger){
        this.logger= logger;
    }

    public void add() {
        System.out.printf("Müşteri eklendi ");
        this.logger.log("Log Mesajı");
    }

    public void update() {
        System.out.println("Müşeri güncellendi ");
        this.logger.log("Log Mesajı");
    }
}
