
package doublylinkedlist;

/**
 *
 * @author HP
 */
public class Node {
    Student info;
    Node next;
    Node prev;

    public Node(Student info) {
        this.info = info;
        this.next = null;
        this.prev = null;
    } 
}
