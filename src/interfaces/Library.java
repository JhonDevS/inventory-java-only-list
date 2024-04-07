package interfaces;

import clases.Book;
import clases.Person;

public interface Library {
    void lendBook(Person customer, Book book, int quantity);
    void returnBook(Person customer, Book book);
    clases.Person findCustomer(String name);
    Book findBook(String title);
    void  removeCustomer(Person person);
    void removeBook(Book book);
}
