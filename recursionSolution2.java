import java.util.*;

public class recursionSolution2 {
    static String digitsAlphabets[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine" };

    public static void numberToString(int num) {
        if (num == 0) {
            return;
        }
        int lastDigit = num%10;
        numberToString(num/10);
        System.out.print(digitsAlphabets[lastDigit] + " ");
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number you want to convert into String: ");
            int enteredNumber = sc.nextInt();
            System.out.print("The number you have entered is: " + enteredNumber);
            System.out.println();
            numberToString(enteredNumber);
        }
    }
}
