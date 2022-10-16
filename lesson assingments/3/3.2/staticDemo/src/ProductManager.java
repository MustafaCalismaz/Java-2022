public class ProductManager {
    public void add(Product product){
        if (ProducthValidator.isValid(product)){
            System.out.println("Eklendi");
        }else {
            System.out.println("Urun Bilgileri gecersizdir");
        }

    }
}
