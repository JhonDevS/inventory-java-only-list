package clases;

public class LinkedList<T> {
    Node<T> head;
    static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
            next = null;
        }
        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    public StringBuilder AllNodes() {
        Node<T> temp = head;
        StringBuilder names = new StringBuilder();
        while (temp != null) {
            if (temp.data instanceof Person person) {
                names.append(person.toString());
            } else if (temp.data instanceof Book book) {
                names.append(book.toString());
            }
            temp = temp.next;
        }
        return names;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void remove(T data) {
        if (head == null) return;

        Node<T> temp = head, prev = null;

        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == head) {
            head = temp.next;
        } else {
            prev.next = temp.next;
        }

        temp = null;
    }

    public Person searchNode(String dni) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data instanceof Person person) {
                if (person.getDni().equalsIgnoreCase(dni)) {
                    return (Person) temp.data;
                }
            }
            temp = temp.next;
        }
        return null;
    }

    public Book searchNodeBook(String isbn) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data instanceof Book book) {
                if (book.getIsbn().equalsIgnoreCase(isbn)) {
                    return (Book) temp.data;
                }
            }
            temp = temp.next;
        }
        return null;
    }
}
