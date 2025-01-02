import java.util.*;

public class recursionRemoveDuplicates {
    public static void uniqueString(String givenString, int startingIndex, StringBuilder newString, boolean[] mappingArray) {
        if (startingIndex == givenString.length()) {
            System.out.print(newString);
            return;
        }
        char currentCharacter = givenString.charAt(startingIndex);
        if (mappingArray[currentCharacter - 'a']) {
            uniqueString(givenString, startingIndex + 1, newString, mappingArray);
        } else {
            mappingArray[currentCharacter - 'a'] = true;
            newString.append(currentCharacter);
            uniqueString(givenString, startingIndex + 1, newString, mappingArray);
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the string from which you want to remove the duplicates: ");
            String givenString = sc.nextLine();
            System.out.print("The String that you have entered is: ");
            System.out.println(givenString);
            System.out.print("After removing the duplicates, the Unique String is: ");
            StringBuilder newString = new StringBuilder();
            boolean[] mappingArray = new boolean[26];
            uniqueString(givenString, 0, newString, mappingArray);
        }
    }
}
