import java.util.*;

public class recursionBasics {
    public static void printingIncreasingDigits(int y){
        if (y > 0 ){
            if (y ==1){
                System.out.print(y + " ");
                return;
            }
            printingIncreasingDigits(y-1);
            System.out.print(y + " ");
        }else if(y == 0){
            System.out.print("0");
            return;
        }else{
            System.out.print("Invlalid Input");
        }
    }
    public static void printingDecreasingDigits(int y) {
        if (y > 0) {
            if (y == 1) {
                System.out.print(y);
                return;
            }
            System.out.print(y + " ");
            printingDecreasingDigits(y - 1);
        }
        else if(y == 0){
            System.out.print("0");
            return;
        }
        else{
            System.out.print("Invalid Input!!");
            return;
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any number: ");
            int enteredNumber = sc.nextInt();
            System.out.print("Enter 1 for Increasing Order and 2 for Decreasing Order: ");
            int c = sc.nextInt();
            if (c ==1){
                printingIncreasingDigits(enteredNumber);
            }else if(c ==2) {
                printingDecreasingDigits(enteredNumber);
            }else{
                System.out.print("Invalid Input select number 1 or 2");
            }
        }
    }
}
