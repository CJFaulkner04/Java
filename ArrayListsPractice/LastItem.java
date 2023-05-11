import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a bunch of strings:");

        while(true){
            String str = input.nextLine();

            if(str.isEmpty()){
                break;
            }

            strings.add(str);
        }

        System.out.println("The last item in the list is: " + strings.get(strings.size() - 1));
    }
}