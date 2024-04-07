package clases;

public class Person {
    private String name;
    private String lastName;
    private String dni;
    private String phoneNumber;
    private String email;
    private final LinkedList<Book> books;
    public Person(String name, String lastName, String dni, String phoneNumber, String email) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.phoneNumber = phoneNumber;
        this.email = email;
        books = new LinkedList<>();
    }
    public Person(String name, String dni) {
        this.name = name;
        this.lastName = "";
        this.dni = dni;
        this.phoneNumber = "";
        this.email = "";
        books = new LinkedList<>();
    }

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getLastName() {
        return this.lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getDni() {
        return this.dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }


    public String getPhoneNumber() {
        return this.phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getEmail() {
        return this.email;
    }


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
                "Books: { " + books.AllNodes() + " }";
    }

    public void addBook(Book book) {
        books.add(book);
    }


    public void removeBook(Book book) {
        books.remove(book);
    }

    public LinkedList<Book> getBooks() {
        return books;
    }
}
