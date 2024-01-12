package plane_classes;

/**
 * DoublyLinkedListInserts is an interface providing methods for inserting elements into a doubly linked list.
 */
public interface DoublyLinkedListInserts {

    /**
     * Inserts an element in order based on the provided comparator, name, and the number of seats in each row.
     * Utilized in PlaneSuper sub-classes, who use the doubly linked list,
     * and inserts passengers at next available seat
     *
     * @param cmp             The comparator used for ordering.
     * @param name            The name of the element to be inserted.
     * @param seatsInEachRow  The number of seats in each row.
     */
    void insertInOrder(CustomComparator<int[]> cmp, String name, int seatsInEachRow);

    /**
     * Inserts an element in order based on the provided comparator, name, and seat information.
     * Utilized in PlaneSuper sub-classes, who use the doubly linked list, and inserts
     * passengers at the provided seat
     *
     * @param cmp   The comparator used for ordering.
     * @param name  The name of the element to be inserted.
     * @param seat  The seat information for the element.
     */
    void insertInOrder(CustomComparator<int[]> cmp, String name, int[] seat);
}
