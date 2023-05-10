import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to take a break?");
        String answer = input.nextLine();

        while(!answer.equals("yes")){
            System.out.println("Do you want to take a break?");
            answer = input.nextLine();
        }
    }
}