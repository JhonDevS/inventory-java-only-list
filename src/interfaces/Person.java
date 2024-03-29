package interfaces;

public interface Person {
    String getName();
    void setName(String name);
    String getLastName();
    void setLastName(String lastName);
    String getDni();
    void setDni(String dni);
    String getPhoneNumber();
    void setPhoneNumber(String phoneNumber);
    String getEmail();
    void setEmail(String email);
    void addBook(Book book);
    void removeBook(Book book);
}
