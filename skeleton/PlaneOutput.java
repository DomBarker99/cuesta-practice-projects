package skeleton;

import plane_classes.PlaneInterface;
import plane_classes.PlaneOutputInterface;

import java.util.Scanner;

public class PlaneOutput implements PlaneOutputInterface {

    private final Scanner scnr;

    private final PlaneInterface plane;

    public PlaneOutput(Scanner scanner, PlaneInterface thePlane){
        scnr = scanner;
        plane = thePlane;
    }

    @Override
    public void planeMenu() {

    }

    @Override
    public void menuAddPassengerAt() {

    }

    @Override
    public void menuAddPassengerNextAvailable() {

    }

    @Override
    public void menuRemovePassenger() {

    }

    @Override
    public void menuSwapPassengers() {

    }
}
