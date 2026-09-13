package stocklist.entities;

public class Product {
	
	private Integer id;
	private String name; 
	private Integer quantity;
	
	
	public Product(Integer id, String name, Integer quantity) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}


	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getQuantity() {
		return quantity;
	}

	
	public void addQuantity(int amount) {
		this.quantity += amount;
	}


	@Override
	public String toString() {
		return  "ID: " + id + ", " + name + ", " + quantity;
	}

	


	
}
