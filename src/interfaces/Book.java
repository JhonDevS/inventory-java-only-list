package interfaces;

public interface Book {
    String getTitle();
    void setTitle(String title);
    String getAuthor();
    void setAuthor(String author);
    String getEditorial();
    void setEditorial(String editorial);
    String getYear();
    void setYear(String year);
    String getEdition();
    void setEdition(String edition);
    String getGenre();
    void setGenre(String genre);
    boolean isAvailable();
    void setAvailable(boolean available);
    int getAvailableQuantity();
    void setAvailableQuantity(int availableQuantity);
}
