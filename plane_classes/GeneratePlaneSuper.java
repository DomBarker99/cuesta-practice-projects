package plane_classes;

import java.util.Scanner;

/**
 * GeneratePlaneSuper is an abstract class providing a blueprint for generating instances of the PlaneSuper class.
 */
public abstract class GeneratePlaneSuper {

    /**
     * Scanner object used for input.
     */
    protected Scanner scnr;

    /**
     * Constructs a GeneratePlaneSuper instance with the specified Scanner.
     *
     * @param scanner The Scanner object for input.
     */
    public GeneratePlaneSuper(Scanner scanner) {
        scnr = scanner;
    }

    /**
     * Creates an instance of the PlaneSuper class based on the provided plane identifier.
     *
     * @param plane The identifier for the type of plane to be created.
     * @return An instance of the PlaneSuper class.
     */
    public abstract PlaneSuper createPlane(int plane);
}
