import clases.Book;
import clases.Library;
import clases.Person;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        /*
         * Instances of initial values.
         */
        Person newPersonOne = new Person("Juan", "1");
        Person newPersonTwo = new Person("Pedro", "2");
        Book myBook = new Book("the prince", "0");
        Book myBook2 = new Book("the prince 2", "1");
        Book myBook3 = new Book("the prince 3", "2");

        /*
        * Default operations.
        */
        library.addCustomer(newPersonOne);
        library.addCustomer(newPersonTwo);
        library.addBook(myBook);
        library.addBook(myBook2);
        library.addBook(myBook3);
        library.lendBook(newPersonOne, myBook, 1);
        library.lendBook(newPersonTwo, myBook2, 1);

        /*
        * Menu of operation.
        */
        boolean exit = false;
        while (!exit) {
            String[] options = {"Add new book", "Add new customer", "Delete book", "Delete customer", "Search book by isbn", "Search customer by dni", "Lend book", "Return book","Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Select to option:", "Main Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    String isbn = JOptionPane.showInputDialog("Enter the genre of the book:");
                    String title = JOptionPane.showInputDialog("Enter the title of the book:");
                    String author = JOptionPane.showInputDialog("Enter the author of the book:");
                    String editorial = JOptionPane.showInputDialog("Enter the publishing house of book:");
                    String year = JOptionPane.showInputDialog("Enter year of book publication:");
                    String edition = JOptionPane.showInputDialog("Enter the edition of the book:");
                    String genre = JOptionPane.showInputDialog("Enter the genre of the book:");
                    int availableQuantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of books available:"));
                    Book newBook = new Book(title, author, editorial, year, edition, genre, availableQuantity, isbn);
                    library.addBook(newBook);
                    JOptionPane.showMessageDialog(null, "Customer successfully created");
                    break;
                case 1:
                    String name = JOptionPane.showInputDialog("Enter the name of the person:");
                    String lastName = JOptionPane.showInputDialog("Enter the last name of the person:");
                    String dni = JOptionPane.showInputDialog("Enter the ID number of the person:");
                    String phoneNumber = JOptionPane.showInputDialog("Enter the phone number of the person:");
                    String email = JOptionPane.showInputDialog("Enter the email of the person:");
                    Person newPerson = new Person(name, lastName, dni, phoneNumber, email);
                    library.addCustomer(newPerson);
                    JOptionPane.showMessageDialog(null, "Book successfully created");
                    break;
                case 2:
                    Book bookSearchToRemove = library.findBook(JOptionPane.showInputDialog("Enter the isbn of the book:"));
                    if (bookSearchToRemove != null) {
                        library.removeBook(bookSearchToRemove);
                        JOptionPane.showMessageDialog(null, "Book successfully deleted");
                    } else {
                        JOptionPane.showMessageDialog(null, "Book not found.");
                    }
                    break;
                case 3:
                    Person customerFindToRemove = library.findCustomer(JOptionPane.showInputDialog("Enter the dni of the customer:"));
                    if (customerFindToRemove != null) {
                        library.removeCustomer(customerFindToRemove);
                        JOptionPane.showMessageDialog(null, customerFindToRemove.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Customer not found.");
                    }
                    break;
                case 4:
                    Book bookSearch = library.findBook(JOptionPane.showInputDialog("Enter the isbn of the book:"));
                    if (bookSearch != null) {
                        JOptionPane.showMessageDialog(null, bookSearch.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Book not found.");
                    }
                    break;
                case 5:
                    Person personSearch = library.findCustomer(JOptionPane.showInputDialog("Enter the dni of the person:"));
                    if (personSearch != null) {
                        JOptionPane.showMessageDialog(null, personSearch.toString());
                        System.out.println(personSearch.getBooks());
                    } else {
                        JOptionPane.showMessageDialog(null, "Customer not found.");
                    }
                    break;
                case 6:
                    Person personBySearch =  library.findCustomer(JOptionPane.showInputDialog("Enter the dni of the person:"));
                    Book bookBySearch = library.findBook(JOptionPane.showInputDialog("Enter the ibsn of the book:"));
                    if (bookBySearch == null || personBySearch == null) {
                        JOptionPane.showMessageDialog(null, "Book or person not found.");
                        break;
                    }
                    try {
                        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of books to lend:"));
                        library.lendBook(personBySearch, bookBySearch, quantity);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Enter numerical data");
                    }
                    break;
                case 7:
                    Person person = library.findCustomer(JOptionPane.showInputDialog("Enter the dni of the person:"));
                    Book book = library.findBook(JOptionPane.showInputDialog("Enter the ibsn of the book:"));
                    if (book == null || person == null) {
                        JOptionPane.showMessageDialog(null, "Book or person not found.");
                        break;
                    }
                    library.returnBook(person, book);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option try again.");
            }
        }
    }
}