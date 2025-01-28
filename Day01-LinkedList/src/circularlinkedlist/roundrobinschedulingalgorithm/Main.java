package circularlinkedlist.roundrobinschedulingalgorithm;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduling scheduler = new RoundRobinScheduling(4);

        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 3);

        System.out.println("Initial Process List:");
        scheduler.displayProcesses();

        scheduler.roundRobinScheduling();
    }
}
