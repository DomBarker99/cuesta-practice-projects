package plane_classes;

/**
 * PlaneOutputInterface is an interface providing a blueprint for generating plane-related outputs and menus.
 */
public interface PlaneOutputInterface {

    /**
     * Displays the main menu for plane-related operations.
     */
    void planeMenu();

    /**
     * Displays the menu for adding a passenger at a specific seat on the plane.
     */
    void menuAddPassengerAt();

    /**
     * Displays the menu for adding a passenger at the next available seat on the plane.
     */
    void menuAddPassengerNextAvailable();

    /**
     * Displays the menu for removing a passenger from the plane.
     */
    void menuRemovePassenger();

    /**
     * Displays the menu for swapping passengers on the plane.
     */
    void menuSwapPassengers();
}
