import java.util.Scanner;

class QueueClass {
    int f = -1;
    int r = -1;
    int n = 10;
    int q[] = new int[n];

    void enqueue(Scanner sc) {
        if (r == n - 1) {
            System.out.println("Overflow");
        } else {
            System.out.println("Enter data:");
            int i = sc.nextInt();
            if (f == -1 && r == -1) {
                f = 0;
                r = 0;
            } else {
                r = r + 1;
            }
            q[r] = i;
        }
    }

    void dequeue() {
        if (f == -1 || f > r) {
            System.out.println("Underflow");
        } else {
            System.out.println("Deleted item: " + q[f]);
            f = f + 1;
            if (f > r) {
                f = r = -1; // Reset queue
            }
        }
    }

    void display() {
        if (f == -1 || f > r) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Items are:");
            for (int i = f; i <= r; i++) {
                System.out.println(q[i]);
            }
        }
    }
}

public class queue {
    public static void main(String args[]) {
        int d;
        Scanner sc = new Scanner(System.in);
        QueueClass s = new QueueClass();
        int l;
        do {
            System.out.println("Press 1 to enqueue");
            System.out.println("Press 2 to dequeue");
            System.out.println("Press 3 to display");
            System.out.print("Enter your choice: ");
            d = sc.nextInt();
            switch (d) {
                case 1 -> s.enqueue(sc);
                case 2 -> s.dequeue();
                case 3 -> s.display();
                default -> System.out.println("Invalid choice.");
            }
            System.out.println("Enter 0 to go back to the main menu");
            System.out.println("Enter any other key to exit");
            l = sc.nextInt();
        } while (l == 0);
        System.out.println("Exited successfully.");
        sc.close();
    }
}