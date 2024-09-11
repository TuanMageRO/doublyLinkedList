
package doublylinkedlist;

/**
 *
 * @author HP
 */
public class MyList {
    private Node head = null; 
    private Node tail = null; 

    public void addLast(Student data) {
        Node newNode = new Node(data);
        if (head == null) { 
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail; 
            tail = newNode;
        }
    }

    public void addFirst(Student data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head; 
            head.prev = newNode; 
            head = newNode; 
        }
    }

    // Delete the first node in the list
    public void deleteFirst() {
        if (head == null) { 
            System.out.println("List is empty");
            return;
        }
        if (head == tail) { 
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null; 
        }
    }

    // Delete the last node in the list
    public void deleteLast() {
        if (head == null) { 
            System.out.println("List is empty");
            return;
        }
        if (head == tail) { 
            head = tail = null;
        } else {
            tail = tail.prev; 
            tail.next = null; 
        }
    }

    public Node search(Student info) {
        Node current = head;
        while (current != null) {
            if (current.info == info) {
                return current;
            }
            current = current.next;
        }
        return null; 
    }

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }

        Node current, index;
        int temp;

        for (current = head; current != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.info.getRollname() > index.info.getRollname()) {
                    temp = current.info.getRollname();
                    current.info.setRollname(index.info.getRollname());
                    index.info.setRollname(temp);
                }
            }
        }
    }

    // Display the list
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.info + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void displayReverse() {
        Node current = tail;
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.info + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}
