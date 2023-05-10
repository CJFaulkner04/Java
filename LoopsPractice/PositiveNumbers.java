import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = 1;

        while(!(num == 0)){
            System.out.println("Enter a number:");
            num = input.nextInt();
            if(num<0) {
                System.out.println("Number must be a positive number");
            } else {
                System.out.println("Number is " + num);
            }

        }
    }
}