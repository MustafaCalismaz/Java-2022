abstract class BaseCreditManager implements ICreditManager {
    @Override
    public abstract void calculate();

    @Override
    public final  void  save() {
        System.out.println("Kaydedildi");
    }
}
