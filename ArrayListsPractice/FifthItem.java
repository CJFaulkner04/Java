import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string (or press enter to quit): ");

        while (true) {
            String str = input.nextLine();

            if (str.isEmpty()) {
                break;
            }

            strings.add(str);
        }

        if (strings.size() >= 5) {
            System.out.println("The fifth string was: " + strings.get(4));
        } else {
            System.out.println("There are not enough strings to determine the fifth item.");
        }
    }
}

