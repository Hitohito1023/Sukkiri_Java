package reChapter11;

public class Book extends TangibleAsset {
	String name;
	int price;
	String color;
	String isbn;

	public Book(String name, int price, String color, double weight, String isbn) {
		super(name, price, color, weight);
		this.isbn= isbn;
	}

	public String getIsbn() {
		return this.isbn;
	}

}
