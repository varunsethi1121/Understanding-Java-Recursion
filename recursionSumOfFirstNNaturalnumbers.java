import java.util.Scanner;

public class recursionSumOfFirstNNaturalnumbers {
    public static int sumOfFirstNNaturalNumbers(int num){
        if(num == 1){
            return 1;
        }
        return num + sumOfFirstNNaturalNumbers(num-1);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number till you want to calculate the sum: ");
            int enteredNumber = sc.nextInt();
            int result = sumOfFirstNNaturalNumbers(enteredNumber);
            System.out.println("Sum of first " + enteredNumber + " Natural Numbers are: " + result);
        }
    }
}
