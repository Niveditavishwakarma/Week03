package stacksandqueues.circulartour;

public class Main {
    public static void main(String[] args) {
        CircularTour tour = new CircularTour();
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startIndex = tour.findStartingPump(petrol, distance);
        System.out.println("Start from petrol pump: " + startIndex);

    }
}
