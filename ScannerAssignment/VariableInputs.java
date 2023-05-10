import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string of text:");
        String text = input.nextLine();
        System.out.println("\nEnter a integer:");
        int integer = input.nextInt();
        System.out.println("\nEnter a double:");
        double doub = input.nextDouble();
        System.out.println("\nEnter a boolean value:");
        boolean bool = input.nextBoolean();

        System.out.println("\nYour string is " + text);
        System.out.println("Your integer is " + integer);
        System.out.println("Your double is " + doub);
        System.out.println("Your boolean is " + bool);
    }
}