import java.util.Scanner;

public class recursionLastOccurance {
    public static int lastOccurance(int array[], int key, int startingIndex) {
        if(startingIndex == array.length){
            return -1;
        }
        int isFound = lastOccurance(array, key, startingIndex+1);

        // COMBINING TWO CONDITIONAL STATEMENTS IN ONE STATEMENT
        if(isFound == -1 && array[startingIndex] == key){
            return startingIndex;
        }
        return isFound;
        
        // if(isFound != -1){
        //     return isFound;
        // }
        // if(array[startingIndex] == key){
        //     return startingIndex;
        // }
        // return -1;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of an array: ");
            int arraySize = sc.nextInt();
            int enteredArray[] = new int[arraySize];
            for (int i = 0; i < enteredArray.length; i++) {
                System.out.print("Enter " + (i + 1) + " th element: ");
                enteredArray[i] = sc.nextInt();
            }

            System.out.print("The array you have entered is: ");
            for (int i = 0; i < enteredArray.length; i++) {
                System.out.print(enteredArray[i] + " ");
            }
            System.out.println();
            System.out.print("Enter the element you want to find in an array: ");
            int targetElement = sc.nextInt();
            int result = lastOccurance(enteredArray, targetElement, 0);
            System.out.print(result);
        }
    }
}
