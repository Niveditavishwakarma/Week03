package binarysearch.rotationpoint;

public class Main {
    public static void main(String[] args) {
        int[] rotatedArray = {6, 7, 9, 15, 19, 2, 3};
        int rotationPoint = RotationPointFinder.findRotationPoint(rotatedArray);

        System.out.println("The rotation point is at index: " + rotationPoint);
        System.out.println("The smallest element is: " + rotatedArray[rotationPoint]);
    }
}
