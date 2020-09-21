package quiz14;

public class Product {	// 물건을 표현할 부모클래스
	
	private int price;
	private String name;
	
	public Product() {}
	public Product(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
