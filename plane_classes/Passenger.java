package plane_classes;

/**
 * Passenger represents an individual passenger with a name and seat information.
 */
public class Passenger {

    /**
     * The name of the passenger.
     */
    public String name;

    /**
     * An array representing the seat information: {row, seatNumber}.
     * Row should be greater than or equal to 0, and seatNumber should be between 0 and 25 (inclusive).
     */
    public int[] passengerSeat;

    /**
     * Constructs a Passenger with the specified name and seat information.
     *
     * @param theName The name of the passenger.
     * @param theSeat An array representing the seat information: {row, seatNumber}.
     *                Row should be greater than or equal to 0, and seatNumber should be between 0 and 25 (inclusive).
     */
    public Passenger(String theName, int[] theSeat) {
        name = theName;
        passengerSeat = theSeat;
    }

    /**
     * Returns a string representation of the passenger, including their name and seat information.
     *
     * @return A formatted string containing the passenger's name and seat information.
     */
    public String toString() {
        return String.format("%s : [%d%c]", name, passengerSeat[0] + 1, (char) (passengerSeat[1] + 65));
    }
}
