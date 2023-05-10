import java.util.Scanner;

public class TestScore {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a grade between 0 and 100");
        int grade = input.nextInt();

        if(grade > 89){
            System.out.println("Your grade is an A :)");
        } else if( 90 >grade && grade > 79 ){
            System.out.println("Youre grade is an B");
        } else if( 80 >grade && grade > 69 ){
            System.out.println("Your grade is an C");
        } else if( 70 >grade && grade > 59 ){
            System.out.println("Your grade is an D");
        } else {
            System.out.println("Your grade is an F :(");
        }
    }
}