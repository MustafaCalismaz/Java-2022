package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
		
		product.setName("Laptop");
		product.setId(1); 
		product.setDescription("Asus Laptop"); 
		product.setPrice(5000.50);
		product.setStokAmount(3);
		product.setColor(null);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

//		productManager.Add2(1, "", "", 2, 222);
//		productManager.Add2(1, "", "", 2, 222);
//		productManager.Add2(1, "", "", 2, 222);
//		productManager.Add2(1, "", "", 2, 222);
//		productManager.Add2(1, "", "", 2, 222);
//		productManager.Add2(1, "", "", 2, 222);

		System.out.println(product.getKod() );
	}

}
