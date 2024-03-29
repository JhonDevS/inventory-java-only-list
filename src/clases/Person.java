package clases;

import interfaces.Book;

public class Person implements interfaces.Person {
    private String name;
    private String lastName;
    private String dni;
    private String phoneNumber;
    private String email;
    private LinkedList<Book> books;
    Person(String name, String lastName, String dni, String phoneNumber, String email) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.phoneNumber = phoneNumber;
        this.email = email;
        books = new LinkedList<>();
    }
    public Person(String name) {
        this.name = name;
        this.lastName = "";
        this.dni = "";
        this.phoneNumber = "";
        this.email = "";
        books = new LinkedList<>();
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getDni() {
        return this.dni;
    }

    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Last Name: " + lastName + "\n" +
                "DNI: " + dni + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Email: " + email + "\n"+
                "Books: " + books.toString();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }
}
