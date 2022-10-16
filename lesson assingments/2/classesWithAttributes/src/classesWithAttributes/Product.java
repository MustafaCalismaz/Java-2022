package classesWithAttributes;

public class Product {

	public Product(int id, String name, String description, double price, int stockAmount, String color) {
		System.out.println("Yapıcı blok çalıştı");
		this.id=id;
		this.color=color;
		this.name=name;
		this.description=description;
		this.price=price;
		this.kod=kod;
		this.stokAmount=stockAmount;
	}
	
	public Product() {
		
	}

	// attribte | field
	private int id;
	private String name;
	private String description;
	private Double price;
	private int stokAmount;
	private String color;
	private String kod;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		// this ifadesi bu classtaki yani buradaki anlamına gelir
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getStokAmount() {
		return stokAmount;
	}

	public void setStokAmount(int stokAmount) {
		this.stokAmount = stokAmount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

}
