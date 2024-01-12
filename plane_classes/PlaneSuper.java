package plane_classes;

/**
 * Abstract class representing a generic airplane with basic passenger management functionality.
 */
public abstract class PlaneSuper {
    /**
     * The name of the plane.
     */
    private final String planeName;

    /**
     * Constructor for the PlaneSuper class.
     *
     * @param name The name of the plane.
     */
    public PlaneSuper(String name) {
        planeName = name;
    }

    /**
     * Gets the name of the plane.
     *
     * @return The name of the plane.
     */
    public String getPlaneName() {
        return planeName;
    }

    /**
     * Adds a passenger at a specific seat on the plane.
     *
     * @param name       The name of the passenger.
     * @param seatNumber The seat number where the passenger will be added.
     * @return true if the passenger is successfully added, false otherwise.
     */
    public abstract boolean addPassengerAt(String name, String seatNumber);

    /**
     * Adds a passenger at the next available seat on the plane.
     *
     * @param name The name of the passenger.
     * @return true if the passenger is successfully added, false otherwise.
     */
    public abstract boolean addPassengerNextAvailable(String name);

    /**
     * Removes a passenger from the plane.
     *
     * @param name The name of the passenger to be removed.
     * @return true if the passenger is successfully removed, false otherwise.
     */
    public abstract boolean removePassenger(String name);

    /**
     * Swaps the positions of two passengers on the plane.
     *
     * @param name1 The name of the first passenger.
     * @param name2 The name of the second passenger.
     * @return true if the passengers are successfully swapped, false otherwise.
     */
    public abstract boolean swapPassengers(String name1, String name2);

    /**
     * Generates a map of the plane, indicating occupied and unoccupied seats.
     *
     * @return A StringBuilder containing the generated plane map.
     */
    public abstract StringBuilder generatePlaneMap();

    /**
     * Validates and extracts the row and seat information from a seat number.
     *
     * @param seatNumber The seat number to validate.
     * @return An array containing the validated row and seat information.
     */
    public abstract int[] validateRowAndSeat(String seatNumber);

    /**
     * Locates a passenger with the given name on the plane.
     *
     * @param name The name of the passenger to locate.
     * @return The Passenger object if found, or null if not found.
     */
    protected abstract Passenger locatePassenger(String name);
}
