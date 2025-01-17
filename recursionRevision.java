import java.util.*;

public class recursionRevision {
    public static void decreasingNumber(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num + " ");
        decreasingNumber(num - 1);
        ;
    }

    public static void increasingNumber(int num) {
        if (num == 0) {
            return;
        }
        increasingNumber(num - 1);
        System.out.print(num + " ");
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of your choice: ");
            int enteredNum = sc.nextInt();
            decreasingNumber(enteredNum);
            System.out.println(" ");
            increasingNumber(enteredNum);

        }
    }
}
