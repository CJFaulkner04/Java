import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number greater than 212:");
        int num = input.nextInt();

        if(num > 212){
            System.out.println("Water is boiling");
        } else {
            System.out.print("Water isn't boiling.");
        }
    }
}