package books;
//1. Stwórz klasę reprezentującą książkę. Książka jest określona przez tytuł, cenę, autora, ISBN. Autor ma imię, nazwisko, płeć. Pozwól na odczyt wszystkich właściwości książki oraz autora, ale nie na ich zmianę spoza klasy.

public class Book {
    private String title;
    private double price;
    private Writer author;
    private String isbn;
    public Book(String title, double price,Writer author, String isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" (" + price + ") - " + author + " - ISBN: " + isbn;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Writer getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
