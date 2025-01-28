package singlylinkedlist.studentrecordmangement;

public class StudentManagement {
    public static void main(String[] args) {
        StudentRecords records = new StudentRecords();

        records.addAtBeginning(101, "Suresh", 20, "A");
        records.addAtEnd(102, "Yogesh", 22, "B");
        records.addAtPosition(2, 103, "Mahesh", 21, "A");

        System.out.println("All Student Records:");
        records.displayAll();

        System.out.println("\nSearching for Roll Number 102:");
        records.searchByRollNumber(102);

        System.out.println("\nUpdating Grade for Roll Number 101 to A+:");
        records.updateGrade(101, "A+");

        System.out.println("\nAll Student Records After Grade Update:");
        records.displayAll();

        System.out.println("\nDeleting Student with Roll Number 103:");
        records.deleteByRollNumber(103);

        System.out.println("\nAll Student Records After Deletion:");
        records.displayAll();
    }
}
