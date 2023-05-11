import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (or enter 0 to finish): ");

        while (true) {
            int integer = input.nextInt();

            if (integer == 0) {
                break;
            }

            integers.add(integer);
        }

        System.out.println("Enter a number to search for: ");
        int searchNumber = input.nextInt();

        int index = integers.indexOf(searchNumber);

        if (index == -1) {
            System.out.println("The number " + searchNumber + " was not found in the list.");
        } else {
            System.out.println("The number " + searchNumber + " was found at index " + index + ".");
        }
    }
}
