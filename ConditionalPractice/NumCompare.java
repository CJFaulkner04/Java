import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = input.nextInt();
        System.out.println("Enter another number:");
        int num2 = input.nextInt();

        if(num1 > num2){
            System.out.println("The first number was larger than second");
        } else if (num1 < num2){
            System.out.println("The second number was larger than first");
        }else{
            System.out.println("The numbers are equal");
        }
    }
}