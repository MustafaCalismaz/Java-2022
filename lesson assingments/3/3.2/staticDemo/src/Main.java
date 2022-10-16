public class Main {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name = "";
        product.price = 10;

        manager.add(product);

      //  DatabaseHelper.Connection.CreateConnection(); onerilmez
    }
}