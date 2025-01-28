package circularlinkedlist.taskscheduler;

 class TaskScheduler {
     private Task head;
     private Task tail;
     private Task currentTask;

     public TaskScheduler() {
         this.head = null;
         this.tail = null;
         this.currentTask = null;
     }

     public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
         Task newTask = new Task(taskId, taskName, priority, dueDate);
         if (head == null) {
             head = newTask;
             tail = newTask;
             newTask.next = head;
             currentTask = head;
         } else {
             newTask.next = head;
             head = newTask;
             tail.next = head;
         }
     }

     public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
         Task newTask = new Task(taskId, taskName, priority, dueDate);
         if (head == null) {
             head = newTask;
             tail = newTask;
             newTask.next = head;
             currentTask = head;
         } else {
             tail.next = newTask;
             tail = newTask;
             tail.next = head;
         }
     }

     public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
         if (position == 1) {
             addAtBeginning(taskId, taskName, priority, dueDate);
             return;
         }

         Task newTask = new Task(taskId, taskName, priority, dueDate);
         Task temp = head;
         int count = 1;

         while (count < position - 1 && temp.next != head) {
             temp = temp.next;
             count++;
         }

         if (count == position - 1) {
             newTask.next = temp.next;
             temp.next = newTask;

             if (temp == tail) {
                 tail = newTask;
             }
         } else {
             System.out.println("Invalid position.");
         }
     }

     public void removeByTaskId(int taskId) {
         if (head == null) {
             System.out.println("The task list is empty.");
             return;
         }

         Task temp = head, prev = null;

         // Handle head deletion
         if (head.taskId == taskId) {
             if (head == tail) {
                 head = null;
                 tail = null;
                 currentTask = null;
             } else {
                 head = head.next;
                 tail.next = head;
             }
             System.out.println("Task with ID " + taskId + " removed.");
             return;
         }

         do {
             prev = temp;
             temp = temp.next;
             if (temp.taskId == taskId) {
                 prev.next = temp.next;

                 if (temp == tail) {
                     tail = prev;
                 }
                 System.out.println("Task with ID " + taskId + " removed.");
                 return;
             }
         } while (temp != head);

         System.out.println("Task with ID " + taskId + " not found.");
     }

     public void viewAndMoveToNext() {
         if (currentTask == null) {
             System.out.println("No tasks available.");
             return;
         }

         System.out.println("Current Task: ID=" + currentTask.taskId + ", Name=" + currentTask.taskName +
                 ", Priority=" + currentTask.priority + ", Due Date=" + currentTask.dueDate);
         currentTask = currentTask.next;
     }

     public void displayAllTasks() {
         if (head == null) {
             System.out.println("The task list is empty.");
             return;
         }

         Task temp = head;
         do {
             System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName +
                     ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
             temp = temp.next;
         } while (temp != head);
     }

     public void searchByPriority(int priority) {
         if (head == null) {
             System.out.println("The task list is empty.");
             return;
         }

         Task temp = head;
         boolean found = false;

         do {
             if (temp.priority == priority) {
                 System.out.println("Task Found: ID=" + temp.taskId + ", Name=" + temp.taskName +
                         ", Due Date=" + temp.dueDate);
                 found = true;
             }
             temp = temp.next;
         } while (temp != head);

         if (!found) {
             System.out.println("No tasks found with priority: " + priority);
         }
     }
 }

