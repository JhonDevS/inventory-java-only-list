package clases;

public class Library implements interfaces.Library{
    private final LinkedList<Person> customers;
    private final LinkedList<Book> books;

    public Library() {
        customers = new LinkedList<>();
        books = new LinkedList<>();
    }


    public void lendBook(Person customer, Book book, int quantity) {
        customer.addBook(book);
        findBook(book.getIsbn()).setAvailableQuantity(quantity);
    }


    public void returnBook(Person customer, Book book) {
        customer.removeBook(book);
        book.setAvailableQuantity();
    }

    public Person findCustomer(String name) {
        return customers.searchNode(name);
    }

    public Book findBook(String title) {
        return books.searchNodeBook(title);
    }

    @Override
    public void removeCustomer(Person customer) {
        customers.remove(customer);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addCustomer(Person person) {
        customers.add(person);
    }
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "customers=" + customers.toString() +
                ", books=" + books.toString() +
                '}';
    }


}
