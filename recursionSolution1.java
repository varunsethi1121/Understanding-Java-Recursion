import java.util.*;

public class recursionSolution1 {
    public static void allOccurance(int array[], int targetElement, int startingIndex){
        if(array.length == startingIndex){
            return;
        }
        if(array[startingIndex] == targetElement){
            System.out.print(startingIndex + " ");

        }
        allOccurance(array, targetElement, startingIndex+1);
}

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements you want to have in your array:");
            int arraySize = sc.nextInt();
            int sampleArray[] = new int[arraySize];
            for(int i=0;i<sampleArray.length;i++){
                System.out.print("Enter " + (i+1) + " element: " );
                sampleArray[i] = sc.nextInt();
            }
            System.out.print("The sample array that you have enetered is: ");
            for(int i=0;i<sampleArray.length;i++){
                System.out.print(sampleArray[i] + " ");
            }
            int startingIndex = 0;
            System.out.print("\nEnter the element you are looking for: ");
            int targetElement = sc.nextInt();
            allOccurance(sampleArray, targetElement, startingIndex);
        }
    }
}
