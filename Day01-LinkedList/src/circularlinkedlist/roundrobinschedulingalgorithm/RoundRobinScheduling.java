package circularlinkedlist.roundrobinschedulingalgorithm;
class RoundRobinScheduling {
    private Process head;
    private Process tail;
    private int timeQuantum;
    private int totalWaitingTime = 0;
    private int totalTurnaroundTime = 0;
    private int numberOfProcesses = 0;

    public RoundRobinScheduling(int timeQuantum) {
        this.head = null;
        this.tail = null;
        this.timeQuantum = timeQuantum;
    }

    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newProcess;
            tail = newProcess;
            newProcess.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
        numberOfProcesses++;
    }

    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("No processes to remove.");
            return;
        }

        Process temp = head;
        Process prev = null;

        if (head.processId == processId) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            System.out.println("Process with ID " + processId + " removed.");
            numberOfProcesses--;
            return;
        }

        while (temp != null && temp.processId != processId) {
            prev = temp;
            temp = temp.next;
        }

        if (temp != null) {
            prev.next = temp.next;
            if (temp == tail) {
                tail = prev;
            }
            System.out.println("Process with ID " + processId + " removed.");
            numberOfProcesses--;
        } else {
            System.out.println("Process with ID " + processId + " not found.");
        }
    }

    public void roundRobinScheduling() {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        Process current = head;

        while (numberOfProcesses > 0) {
            if (current.burstTime > timeQuantum) {
                current.burstTime -= timeQuantum;
                current = current.next;
            } else {
                removeProcess(current.processId);
                if (numberOfProcesses > 0) {
                    current = current.next;
                }
            }

            displayProcesses();
        }

        if (numberOfProcesses > 0) {
            System.out.println("Average Waiting Time: " + (totalWaitingTime * 1.0) / numberOfProcesses);
            System.out.println("Average Turnaround Time: " + (totalTurnaroundTime * 1.0) / numberOfProcesses);
        } else {
            System.out.println("Average Waiting Time: 0");
            System.out.println("Average Turnaround Time: 0");
        }
    }

    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the list.");
            return;
        }

        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.processId + ", Burst Time: " + temp.burstTime +
                    ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}