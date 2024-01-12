package skeleton;

import plane_classes.CustomComparator;
import plane_classes.DoublyLinkedList;
import plane_classes.DoublyLinkedListInserts;
import plane_classes.Passenger;

public class PlaneDoublyLinkedList extends DoublyLinkedList<Passenger>
                                    implements DoublyLinkedListInserts {

    public PlaneDoublyLinkedList() {
        super();
    }

    @Override
    public void insertInOrder(CustomComparator<int[]> cmp, String name, int seatsInEachRow) {

    }

    @Override
    public void insertInOrder(CustomComparator<int[]> cmp, String name, int[] seat) {

    }
}
