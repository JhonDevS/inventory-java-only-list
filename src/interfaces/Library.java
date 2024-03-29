package interfaces;

public interface Library {
    void lendBook(String persona, Book book);
    void returnBook(Person persona, Book book);
    clases.Person findCustomer(String name);
    Book findBook(String title);
}
