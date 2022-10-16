public class mySqlCustomerDal implements ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println("My sql eklendi.");
    }
}
