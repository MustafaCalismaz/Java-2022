public class CustomerManager {
    private  Customer customer;
    private ICreditManager creditManager;
    public CustomerManager(Customer customer, ICreditManager creditManager) {
        this.customer=customer;
        this.creditManager = creditManager;
    }

    public void save(Customer customer) {
        System.out.println("Musteri Kaydedildi" );
    }
    public void delete(Customer customer) {
        System.out.println("Musteri Silindi" );
    }

    public void giveCredit(){
        creditManager.calculate();
        System.out.println("Kredi verildi");
    }
}
