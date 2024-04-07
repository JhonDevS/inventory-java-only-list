package clases;

public class Book {
    private String title;
    private String author;
    private String editorial;
    private String year;
    private String edition;
    private String genre;
    private boolean available;
    private int availableQuantity;
    private String isbn;
    public Book(String title, String author, String editorial, String year, String edition, String genre, int availableQuantity, String isbn) {
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.year = year;
        this.edition = edition;
        this.genre = genre;
        this.available = true;
        this.availableQuantity = availableQuantity;
        this.isbn = isbn;
    }
    public Book(String title, String isbn) {
        this.title = title;
        this.author = "";
        this.editorial = "";
        this.year = "";
        this.edition = "";
        this.genre = "";
        this.available = true;
        this.availableQuantity = 1;
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return this.author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public String getEditorial() {
        return this.editorial;
    }


    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    public String getYear() {
        return this.year;
    }


    public void setYear(String year) {
        this.year = year;
    }


    public String getEdition() {
        return this.edition;
    }


    public void setEdition(String edition) {
        this.edition = edition;
    }


    public String getGenre() {
        return this.genre;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String toString() {
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nEditorial: " + this.editorial + "\nYear: " + this.year + "\nEdition: " + this.edition + "\nGenre: " + this.genre + "\nAvailable: " + this.available + "\nAvailable Quantity: " + this.availableQuantity + "\n";
    }


    public boolean isAvailable() {
        return this.available;
    }


    public void setAvailable(boolean available) {
        this.available = available;
    }


    public int getAvailableQuantity() {
        return this.availableQuantity;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public void setAvailableQuantity(int availableQuantity) {
        int availableQuantityTemp = this.availableQuantity - availableQuantity;
        if(availableQuantityTemp < 0) {
            System.out.println("The quantity of books to lend is greater than the available quantity");
            return;
        }
        if(availableQuantityTemp == 0) {
            this.available = false;
        }
        this.availableQuantity = availableQuantityTemp;
    }


    public void setAvailableQuantity() {
        this.availableQuantity++;
    }
}
