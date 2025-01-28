package circularlinkedlist.taskscheduler;

public class Main {
        public static void main(String[] args) {
            TaskScheduler scheduler = new TaskScheduler();

            scheduler.addAtBeginning(1, "Prepare Report", 3, "2025-01-30");
            scheduler.addAtEnd(2, "Team Meeting", 2, "2025-02-01");
            scheduler.addAtPosition(2, 3, "Code Review", 1, "2025-01-28");

            System.out.println("All Tasks:");
            scheduler.displayAllTasks();

            System.out.println("\nView and Move to Next Task:");
            scheduler.viewAndMoveToNext();
            scheduler.viewAndMoveToNext();

            System.out.println("\nSearch for Tasks with Priority 2:");
            scheduler.searchByPriority(2);

            System.out.println("\nRemoving Task with ID 2:");
            scheduler.removeByTaskId(2);

            System.out.println("\nAll Tasks After Removal:");
            scheduler.displayAllTasks();
        }
    }


