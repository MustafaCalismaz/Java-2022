public class Main {
    public static void main(String[] args) {

        CustomewrManager customewrManager = new CustomewrManager(new MySqlCustomerDal());
        customewrManager.add();
    }
}