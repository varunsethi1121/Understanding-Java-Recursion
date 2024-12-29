import java.util.Scanner;

public class recursionTilingProblem {
    public static int tilingProblem(int num){
        if(num ==0 || num==1){
            return 1;
        }
        int fnm1 = tilingProblem(num-1);
        int fnm2 = tilingProblem(num-2);
        int totalTiles = fnm1 + fnm2;
        return totalTiles;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the width of the floor: ");
            int enteredNumber = sc.nextInt();
            int result = tilingProblem(enteredNumber);
            System.out.println("Total number of tiles used to cover floor of width " + enteredNumber + " is:  " + result);
        }
    }
}

