import java.util.Scanner;

public class DivideMethods {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = input.nextInt();
        System.out.println("Enter second number:");
        int b = input.nextInt();

        System.out.println(a + " / " + b + " = " + div(a,b));
    }
    public static double div(double x, double y){
        return x/y;
    }
}