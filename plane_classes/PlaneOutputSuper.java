package plane_classes;

import java.util.Scanner;

/**
 * PlaneOutputSuper is an abstract class providing a blueprint for generating plane-related outputs and menus.
 */
public abstract class PlaneOutputSuper {

    /**
     * Scanner object used for input.
     */
    protected final Scanner scnr;

    /**
     * The PlaneSuper object associated with the output.
     */
    protected PlaneSuper plane;

    /**
     * Constructs a PlaneOutputSuper instance with the specified Scanner and PlaneSuper objects.
     *
     * @param scanner The Scanner object for input.
     * @param thePlane The PlaneSuper object associated with the output.
     */
    public PlaneOutputSuper(Scanner scanner, PlaneSuper thePlane) {
        scnr = scanner;
        plane = thePlane;
    }

    /**
     * Displays the main menu for plane-related operations.
     */
    public abstract void planeMenu();

    /**
     * Displays the menu for adding a passenger at a specific seat on the plane.
     *
     * @param plane The PlaneSuper object.
     */
    public abstract void menuAddPassengerAt(PlaneSuper plane);

    /**
     * Displays the menu for adding a passenger at the next available seat on the plane.
     *
     * @param plane The PlaneSuper object.
     */
    public abstract void menuAddPassengerNextAvailable(PlaneSuper plane);

    /**
     * Displays the menu for removing a passenger from the plane.
     *
     * @param plane The PlaneSuper object.
     */
    public abstract void menuRemovePassenger(PlaneSuper plane);

    /**
     * Displays the menu for swapping passengers on the plane.
     *
     * @param plane The PlaneSuper object.
     */
    public abstract void menuSwapPassengers(PlaneSuper plane);
}
