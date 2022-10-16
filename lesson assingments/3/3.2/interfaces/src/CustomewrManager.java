public class CustomewrManager {
    private ICustomerDal customerDal;
    public CustomewrManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add() {
        //is kodlari yazilir
        customerDal.Add();
    }
}
