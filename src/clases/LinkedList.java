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

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
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

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data instanceof Person person) {
                System.out.println(person.toString());
            } else if (temp.data instanceof Book book) {
                System.out.println(book.toString());
            }
            temp = temp.next;
        }
    }

    public Node<T> searchNode(T data) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data == data || temp.data.equals(data)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Person searchNode(String name) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data instanceof Person person) {
                if (person.getName().equals(name)) {
                    return (Person) temp.data;
                }
            }
            temp = temp.next;
        }
        return null;
    }
}
