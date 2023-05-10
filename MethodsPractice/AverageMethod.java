import java.util.Scanner;

public class AverageMethod {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int sum = sum(num1, num2, num3);
        System.out.println("The average is: " + average(sum));
    }

    public static int sum(int x, int y, int z){
        return x+y+z;
    }
    public static double average(int a){
        return a/3;
    }
}