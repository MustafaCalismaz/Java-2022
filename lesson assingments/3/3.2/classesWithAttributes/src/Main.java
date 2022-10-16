public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"laptop","Asus Laptop",3000, 2, "siyah");
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.getKod();

        Productmanager productmanager = new Productmanager();
        productmanager.Add(product);

        System.out.println(product.getKod());
    }
}