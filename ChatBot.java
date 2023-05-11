import java.util.ArrayList;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args){
        ArrayList<Integer> integers = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        Greeting();
        Repeat(input);
        Guess(input);
        count(input);
        test(input);

    }

    public static void Greeting(){
        System.out.println("Hello, I am chat bot!");
    }

    public static String Repeat(Scanner input){
        ArrayList<String> strings = new ArrayList<String>();

        System.out.println("Repeat your name(press enter to stop):");

        while(true){
            String str = input.nextLine();

            if(str.isEmpty()){
                break;
            }

            strings.add(str);
        }
        return "You repeated your name " + (strings.size()-1) + "times";
    }

    public static int Guess(Scanner input){
        System.out.println("Let me guess your age.");
        System.out.print("What year were you born? ");
        int year = input.nextInt();
        int age = 2023 - year;
        System.out.println("You are probably " + age + " years old.");
        return age;
    }

    public static void count(Scanner input) {
        System.out.print("Enter a number to count to: ");
        int number = input.nextInt();
        System.out.println("Counting to " + number + "...");
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static void test(Scanner input) {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What data type is used to store true or false values in Java?\n");
        System.out.println("a) int");
        System.out.println("b) float");
        System.out.println("c) boolean");
        System.out.println("d) char");

        String answer = input.nextLine();

        while (!answer.equals("c")) {
            System.out.println("Sorry, that's incorrect. Please try again.");
            answer = input.nextLine();
        }

        System.out.println("Congratulations, that's correct!");
    }

}