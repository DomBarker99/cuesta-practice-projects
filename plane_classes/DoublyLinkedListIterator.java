package plane_classes;

/**
 * DoublyLinkedListIterator represents an iterator for a doubly linked list.
 *
 * @param <AnyType> The type of elements stored in the doubly linked list.
 */
public class DoublyLinkedListIterator<AnyType> {

    /**
     * The current node being pointed to by the iterator.
     */
    DoublyListNode<AnyType> current;

    /**
     * Constructs a DoublyLinkedListIterator with the specified initial node.
     *
     * @param theNode The initial node for the iterator.
     */
    DoublyLinkedListIterator(DoublyListNode<AnyType> theNode) {
        current = theNode;
    }

    /**
     * Checks if the iterator is pointing to a valid node (not null and not a head or tail sentinel node).
     *
     * @return true if the iterator is valid, false otherwise.
     */
    public boolean isValid() {
        return current != null && current.element != null;
    }

    /**
     * Retrieves the element stored in the current node pointed to by the iterator.
     *
     * @return The element if the iterator is valid, null otherwise.
     */
    public AnyType retrieve() {
        return isValid() ? current.element : null;
    }

    /**
     * Advances the iterator to the next node in the doubly linked list.
     */
    public void advance() {
        if (isValid())
            current = current.next;
    }

    /**
     * Retreats the iterator to the previous node in the doubly linked list.
     */
    public void retreat() {
        if (isValid())
            current = current.prev;
    }
}
