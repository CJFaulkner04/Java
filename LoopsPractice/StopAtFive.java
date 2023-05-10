import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = input.nextInt();

        while(!(num == 5)){
            System.out.println("Give a number?");
            num = input.nextInt();
        }
    }
}