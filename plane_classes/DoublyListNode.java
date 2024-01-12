package plane_classes;

/**
 * DoublyListNode represents a node in a doubly linked list.
 *
 * @param <AnyType> The type of the element stored in the node.
 */
public class DoublyListNode<AnyType> {

    /**
     * The element stored in the node.
     */
    AnyType element;

    /**
     * Reference to the next node in the doubly linked list.
     */
    DoublyListNode<AnyType> next;

    /**
     * Reference to the previous node in the doubly linked list.
     */
    DoublyListNode<AnyType> prev;

    /**
     * Constructs a DoublyListNode with the specified element, previous node, and next node.
     *
     * @param x        The element to be stored in the node.
     * @param thePrev  The previous node in the doubly linked list.
     * @param theNext  The next node in the doubly linked list.
     */
    DoublyListNode(AnyType x, DoublyListNode<AnyType> thePrev, DoublyListNode<AnyType> theNext) {
        element = x;
        prev = thePrev;
        next = theNext;
    }
}
