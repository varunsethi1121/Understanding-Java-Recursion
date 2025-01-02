import java.util.*;
public class recursionFriendsPairingProblem {
    public static int friendsPairingProblem(int num){
        if(num==1 || num==2){
            return num;
        }return friendsPairingProblem(num-1) + (num-1) * friendsPairingProblem(num-2);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of friends Invited for the party: ");
            int numberOfFriends = sc.nextInt();
            System.out.print(friendsPairingProblem(numberOfFriends));
        }
    }
}
