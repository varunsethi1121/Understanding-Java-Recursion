import java.util.Scanner;

public class recursionLastOrFirstOccurance {
    public static int firstOccurance(int array[], int key, int startingIndex){
        if(startingIndex == array.length){
            return -1;
        }
        if (array[startingIndex] == key){
            return startingIndex;
        }
        return firstOccurance(array, key, startingIndex+1);
    }
    public static int lastOccurance(int array[], int key, int startingIndex){
        if(startingIndex == array.length){
            return -1;
        }
        int isFound = lastOccurance(array, key, startingIndex+1);
        if(isFound == -1 && array[startingIndex] == key){
            return startingIndex;
        }
        return isFound;

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
            System.out.print("Select 1 for 'FirstOccurane' and 2 for 'LastOccurance' respectively: ");
            int choice = sc.nextInt();
            if(choice == 1){
                int result = firstOccurance(enteredArray, targetElement, 0);
                System.out.print("First Ocurance of " + targetElement + " is: " + result);
            }else if(choice == 2){
                int result = lastOccurance(enteredArray, targetElement, 0);
                System.out.print("Last Ocurance of " + targetElement + " is: " + result);
            }else{
                System.out.print("Invalid Choice...");
            }
        }
    }
}
