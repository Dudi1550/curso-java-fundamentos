package book.entities;

public class Book {
	
	private Integer isbn;
	private String title; 
	private Double price;
	
	public Book(Integer isbn, String title, Double price) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return isbn + ", " + title + ", " + price;
	}

	
	
	
	
	

}
