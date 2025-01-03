import java.util.*;
public class recursionSolution3 {
    static int countSubstrings(String str) {
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            count++;
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++; 
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the string whose substring you want to calculate: ");
            String enteredString = sc.nextLine();
            System.out.println("The string that you have entered is: " + enteredString);
            System.out.print(countSubstrings(enteredString));
        }
    }
}
