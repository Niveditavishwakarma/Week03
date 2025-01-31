package stacksandqueues.circulartour;

public class CircularTour {
    public int findStartingPump(int[] petrol, int[] distance) {
        int total_petrol = 0, total_distance = 0;
        int surplus = 0, start = 0;

        for (int i = 0; i < petrol.length; i++) {
            total_petrol += petrol[i];
            total_distance += distance[i];
            surplus += petrol[i] - distance[i];

            if (surplus < 0) {
                start = i + 1;
                surplus = 0;
            }
        }

        return (total_petrol >= total_distance) ? start : -1;
    }
}
