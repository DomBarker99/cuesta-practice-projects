package plane_classes;

/**
 * DoublyLinkedList represents a doubly linked list where elements are inserted at the tail.
 *
 * @param <AnyType> The type of elements stored in the Doubly Linked List.
 */
public class DoublyLinkedList<AnyType> {

    /**
     * Head sentinel node of the doubly linked list.
     */
    private final DoublyListNode<AnyType> head;

    /**
     * Tail sentinel node of the doubly linked list.
     */
    private final DoublyListNode<AnyType> tail;

    /**
     * The number of elements in the doubly linked list.
     */
    private int size;

    /**
     * Constructs an empty DoublyLinkedList with head and tail sentinel nodes.
     */
    public DoublyLinkedList() {
        tail = new DoublyListNode<>(null, null, null);
        head = new DoublyListNode<>(null, null, tail);
        tail.prev = head;
        size = 0;
    }

    /**
     * Checks if the doubly linked list is empty.
     *
     * @return true if the list is empty, false otherwise.
     */
    public boolean isEmpty() {
        return head.next.equals(tail);
    }

    /**
     * Removes all elements from the doubly linked list, leaving it empty.
     */
    public void makeEmpty() {
        head.next = tail;
        tail.prev = head;
    }

    /**
     * Returns an iterator for the first element in the doubly linked list.
     *
     * @return DoublyLinkedListIterator for the first element.
     */
    public DoublyLinkedListIterator<AnyType> first() {
        return new DoublyLinkedListIterator<>(head.next);
    }

    /**
     * Returns an iterator for the last element in the doubly linked list.
     *
     * @return DoublyLinkedListIterator for the last element.
     */
    public DoublyLinkedListIterator<AnyType> last() {
        return new DoublyLinkedListIterator<>(tail.prev);
    }

    /**
     * Finds an element in the doubly linked list and returns an iterator to its position.
     *
     * @param x The element to find.
     * @return DoublyLinkedListIterator pointing to the element if found, null otherwise.
     */
    public DoublyLinkedListIterator<AnyType> find(AnyType x) {
        if (x != null && !isEmpty()) {
            DoublyLinkedListIterator<AnyType> itr = first();

            while (itr.isValid() && !itr.retrieve().equals(x))
                itr.advance();

            // x never found
            return itr.isValid() ? itr : null;
        }
        return null;
    }

    /**
     * Inserts an element at the tail of the doubly linked list.
     *
     * @param x The element to insert.
     */
    public void add(AnyType x) {
        if (x != null) {
            tail.prev.next = new DoublyListNode<>(x, tail.prev, tail);
            tail.prev = tail.prev.next;
            ++size;
        }
    }

    /**
     * Inserts an element before the specified iterator position.
     *
     * @param itr The iterator position before which the element is inserted.
     * @param x   The element to insert.
     */
    public void addBefore(DoublyLinkedListIterator<AnyType> itr, AnyType x) {
        if (x != null) {
            if (isEmpty())
                add(x);
            else {
                itr.current.prev.next = new DoublyListNode<>(x, itr.current.prev, itr.current);
                itr.current.prev = itr.current.prev.next;
                ++size;
            }
        }
    }

    /**
     * Removes an element from the doubly linked list.
     *
     * @param x The element to remove.
     * @return true if the element is successfully removed, false otherwise.
     */
    public boolean remove(AnyType x) {
        if (x != null && !isEmpty()) {
            DoublyLinkedListIterator<AnyType> itr = find(x);

            if (itr != null) {
                itr.current.next.prev = itr.current.prev;
                itr.current.prev.next = itr.current.next;
                --size;
                return true;
            }
        }
        return false;
    }

    /**
     * Replaces occurrences of 'before' with 'after' in the doubly linked list.
     *
     * @param before The element to be replaced.
     * @param after  The element to replace 'before'.
     * @return true if the replacement is successful, false otherwise.
     */
    public boolean replace(AnyType before, AnyType after) {
        if (before != null && after != null && !isEmpty()) {
            DoublyLinkedListIterator<AnyType> itr = find(before);

            // itr == null if 'before' is never found
            if (itr != null) {
                itr.current.prev.next = new DoublyListNode<>(after, itr.current.prev, itr.current.next);
                itr.current.next.prev = itr.current.prev.next;
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the number of elements in the doubly linked list.
     *
     * @return The number of elements in the list.
     */
    public int size() {
        return size;
    }

    /**
     * Generates a string representation of the doubly linked list.
     *
     * @param list The DoublyLinkedList to print.
     * @param <AnyType> The type of elements stored in the list.
     * @return A StringBuilder containing the string representation of the list.
     */
    public static <AnyType> StringBuilder printList(DoublyLinkedList<AnyType> list) {
        StringBuilder output = new StringBuilder("List is currently empty");

        if (!list.isEmpty()) {
            output = new StringBuilder();
            DoublyLinkedListIterator<AnyType> itr = list.first();

            while (itr.isValid()) {
                output.append(itr.current.element).append(" ");
                itr.advance();
            }
        }

        return output;
    }
}