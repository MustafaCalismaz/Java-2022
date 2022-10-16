public class Main {
    public static void main(String[] args) {

        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new TarimKrediManager(), new OgretmenKrediManager(), new OgrenciKrediManager()};

        for (BaseKrediManager kredimanager : krediManagers) {
            System.out.println(kredimanager.hesapla(1000));
        }
    }
}