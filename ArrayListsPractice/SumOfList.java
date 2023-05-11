import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
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

        int sum = getSum(integers);

        System.out.println("The sum of the list is: " + sum);
    }

    public static int getSum(ArrayList<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum;
    }
}
