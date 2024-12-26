import java.util.*;
public class recursionFactorial {
    public static int factorialFunction(int num){
        if(num == 0){
            return 1;
        }else if(num > 0){
            return num*factorialFunction(num-1);
        }else{
            //System.out.println("Invalid input enter any number which is equal to or grater than 0.");
            return -1;
        } 
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number whose factorial you want to calculate: ");
            int enteredNumber = sc.nextInt();
            int result = factorialFunction(enteredNumber);
            System.out.println("Factorial of " + enteredNumber + " is:  " + result);
        }
    }
}
