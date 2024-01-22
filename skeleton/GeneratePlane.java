package skeleton;

import plane_classes.GeneratePlaneInterface;
import plane_classes.PlaneInterface;

import java.util.Scanner;

public class GeneratePlane implements GeneratePlaneInterface {

    private final Scanner scnr;

    public GeneratePlane(Scanner scanner) {
        scnr = scanner;
    }

    @Override
    public PlaneInterface createPlane(int plane) {
        return null;
    }
}
