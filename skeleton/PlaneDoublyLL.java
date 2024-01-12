package skeleton;

import plane_classes.CustomComparator;
import plane_classes.Passenger;
import plane_classes.PlaneSuper;

public class PlaneDoublyLL extends PlaneSuper {

    private final int rows;
    private final int seatsInEachRow;
    private PlaneDoublyLinkedList seatList;

    public PlaneDoublyLL(String name, int totalRows, int totalSeatsInEachRow) {
        super(name);
        rows = totalRows;
        seatsInEachRow = totalSeatsInEachRow;
        seatList = new PlaneDoublyLinkedList();
    }

    @Override
    public boolean addPassengerAt(String name, String seatNumber) {
        return false;
    }

    @Override
    public boolean addPassengerNextAvailable(String name) {
        return false;
    }

    @Override
    public boolean removePassenger(String name) {
        return false;
    }

    @Override
    public boolean swapPassengers(String name1, String name2) {
        return false;
    }

    @Override
    public StringBuilder generatePlaneMap() {
        return null;
    }

    @Override
    public int[] validateRowAndSeat(String seatNumber) {
        return new int[0];
    }

    @Override
    protected Passenger locatePassenger(String name) {
        return null;
    }

    static class SeatCustomComparator implements CustomComparator<int []> {
        @Override
        public int compareTo(int[] lhs, int[] rhs) {
            return 0;
        }
    }
}
