package skeleton;

import plane_classes.Passenger;
import plane_classes.PlaneInterface;

public class Plane2DArray implements PlaneInterface {
    private final String planeName;
    private final Passenger[][] seatList;

    public Plane2DArray(String name, int totalRows, int totalSeatsInEachRow) {
        planeName = name;
        seatList = new Passenger [totalRows] [totalSeatsInEachRow];
    }

    @Override
    public String getPlaneName() {
        return null;
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

    private Passenger locatePassenger(String name) {
        return null;
    }
}