package plane_classes;

/**
 * GeneratePlaneInterface is an interface providing a blueprint for generating instances of planes.
 */
public interface GeneratePlaneInterface {

    /**
     * Creates an instance of a plane based on the provided plane identifier.
     *
     * @param plane The identifier for the type of plane to be created.
     * @return An instance of a plane.
     */
    PlaneInterface createPlane(int plane);
}
