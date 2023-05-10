import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word1 = input.nextLine();
        System.out.println("Enter another word:");
        String word2 = input.nextLine();

        if(word1.toUpperCase().equals(word2.toUpperCase())){
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
    }
}