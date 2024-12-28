import java.util.Scanner;

public class recursionArrayIsSortedOrNot {

    public static int sortedAscendingArrayFunction(int array[], int startingIndex, int endingIndex) {
        if (startingIndex >= endingIndex) { 
            return 1;
        } else if (array[startingIndex] > array[startingIndex + 1]) { 
            return -1;
        }
        return sortedAscendingArrayFunction(array, startingIndex + 1, endingIndex);
    }

    public static int sortedDescendingArrayFunction(int array[], int startingIndex, int endingIndex){
        if(startingIndex >= endingIndex){
            return 1;
        }else if(array[startingIndex] < array[startingIndex+1]){
            return -1;
        }
        return sortedDescendingArrayFunction(array, startingIndex+1, endingIndex);
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

            int result = sortedAscendingArrayFunction(enteredArray, 0, enteredArray.length - 1);
            // int result = sortedDescendingArrayFunction(enteredArray, 0, enteredArray.length - 1);

            if (result == -1) {
                System.out.println("The array that you have entered is NOT sorted.");
            } else {
                System.out.println("The array you have entered is sorted.");
            }
        }
    }
}