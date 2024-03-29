package clases;

import interfaces.Book;

public class Library implements interfaces.Library{
    private final LinkedList<Person> customers;
    private final LinkedList<Book> books;

    public Library() {
        customers = new LinkedList<>();
        books = new LinkedList<>();
    }

    @Override
    public void lendBook(String name, Book book) {
        Person customer = findCustomer(name);
        if (customer == null) {
            System.out.println("Customer not found");
            return;
        }
        customer.addBook(book);
    }

    @Override
    public void returnBook(interfaces.Person persona, Book book) {

    }

    public Person findCustomer(String name) {
        return customers.searchNode(name);
    }

    public Book findBook(String title) {
        return null;
    }

    public void addCustomer(Person person) {
        customers.add(person);
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void printCustomers() {
        customers.print();
    }

    @Override
    public String toString() {
        return "Library{" +
                "customers=" + customers.toString() +
                ", books=" + books.toString() +
                '}';
    }
}
