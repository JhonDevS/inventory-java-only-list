import clases.Book;
import clases.Library;
import clases.Person;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addCustomer(new Person("Juan"));
        library.addCustomer(new Person("Pedro"));
        Book myBook = new Book("the prince");
        Book myBook2 = new Book("the prince 2");
        Book myBook3 = new Book("the prince 3");
        library.addBook(myBook);
        library.addBook(myBook2);
        library.addBook(myBook3);
        //library.lendBook("Juan", myBook);
        library.lendBook("Juan", myBook2);
        System.out.println(library.findCustomer("Juan"));
    }
}