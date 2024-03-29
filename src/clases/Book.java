package clases;

public class Book implements interfaces.Book{
    private String title;
    private String author;
    private String editorial;
    private String year;
    private String edition;
    private String genre;
    private boolean available;
    private int availableQuantity;
    Book(String title, String author, String editorial, String year, String edition, String genre, int availableQuantity) {
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.year = year;
        this.edition = edition;
        this.genre = genre;
        this.available = true;
        this.availableQuantity = availableQuantity;
    }
    public Book(String title) {
        this.title = title;
        this.author = "";
        this.editorial = "";
        this.year = "";
        this.edition = "";
        this.genre = "";
        this.available = true;
        this.availableQuantity = 1;
    }
    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getEditorial() {
        return this.editorial;
    }

    @Override
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String getYear() {
        return this.year;
    }

    @Override
    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String getEdition() {
        return this.edition;
    }

    @Override
    public void setEdition(String edition) {
        this.edition = edition;
    }

    @Override
    public String getGenre() {
        return this.genre;
    }

    @Override
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nEditorial: " + this.editorial + "\nYear: " + this.year + "\nEdition: " + this.edition + "\nGenre: " + this.genre;
    }

    @Override
    public boolean isAvailable() {
        return this.available;
    }

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public int getAvailableQuantity() {
        return this.availableQuantity;
    }

    @Override
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
}
