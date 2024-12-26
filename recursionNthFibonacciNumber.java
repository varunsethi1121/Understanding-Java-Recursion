import java.util.Scanner;

public class recursionNthFibonacciNumber {
    public static int fibonacciFunction(int num){
        if(num == 0 || num == 1){
            return num;
        }
        return fibonacciFunction(num-1) + fibonacciFunction(num-2);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            int enteredNumber = sc.nextInt();
            int result = fibonacciFunction(enteredNumber);
            System.out.println("Fibonacci at " + enteredNumber + " is:  " + result);
        }
    }
}
