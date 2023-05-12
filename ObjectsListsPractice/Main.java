import java.util.Scanner;
import java.util.ArrayList;

class Animal {

    private String name;
    private boolean dogCheck;
    public Animal(String name, boolean dogCheck){
        this.name = name;
        this.dogCheck = dogCheck;
    }
    public String getName() {
        return name;
    }

    public boolean dogCheck() {
        return dogCheck;
    }

    @Override
    public String toString(){
        return name + " is a Dog = " + dogCheck;
    }

}

class TvShow {
    private String showName;
    private int num;
    private String genre;

    public TvShow(String showName, int num, String genre){
        this.showName = showName;
        this.num = num;
        this.genre = genre;
    }

    public String getShowName(){
        return showName;
    }

    public int getNum(){
        return num;
    }

    public String getGenre(){
        return genre;
    }

    @Override
    public String toString(){
        return "The name of the show is " + showName + " with " + num + " episodes. The genre is " + genre;
    }
}

class Books{
    private String title;
    private int pages;
    private String year;

    public Books(String title, int pages, String year){
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle(){
        return title;
    }

    public int getPages(){
        return pages;
    }

    public String getYear(){
        return year;
    }

    @Override

    public String toString(){
        return title + ", " + pages + " pages, " + year;
    }
}

public class Main {
    public static void  main(String[] args){
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Scanner input = new Scanner(System.in);
        System.out.println("------Animal-----");
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");
        while(true){
            System.out.print("Please enter a name: ");
            String name = input.nextLine();

            if(name.isEmpty()){
                break;
            }

            System.out.print("Is it a dog?(True or False): ");
            boolean checkDog = input.nextBoolean();
            input.nextLine();

            animals.add(new Animal(name, checkDog));
        }

        for(Animal animal : animals){
            System.out.println(animal.toString());
        }

        //TvShows
        ArrayList<TvShow> tv = new ArrayList<TvShow>();
        System.out.println("\n------TV Shows-----");
        System.out.println("TvShows List");
        System.out.println("Entering nothing will stop the loop");
        while(true){
            System.out.println("Name of the show:");
            String showName = input.nextLine();

            if(showName.isEmpty()){
                break;
            }

            System.out.println("How many episodes?");
            int num = input.nextInt();
            input.nextLine();

            System.out.println("What is the genre?");
            String genre = input.nextLine();

            tv.add(new TvShow(showName, num, genre));
        }

        for(TvShow tvshow : tv){
            System.out.println(tvshow.toString());
        }

        //Books
        ArrayList<Books> books = new ArrayList<Books>();
        System.out.println("\n------Books-----");
        System.out.println("Book List");
        System.out.println("Entering nothing will stop the loop");
        while(true){
            System.out.print("Title: ");
            String title = input.nextLine();

            if(title.isEmpty()){
                break;
            }

            System.out.print("How many pages?: ");
            int pages = input.nextInt();
            input.nextLine();

            System.out.print("Year published: ");
            String year = input.nextLine();

            books.add(new Books(title, pages, year));
        }

        System.out.print("What do you want to print?('everything' or just 'names'): ");
        String choice = input.nextLine();

        if(choice.equalsIgnoreCase("everything")){
            for(Books b : books){
                System.out.println(b.toString());
            }
        } else {
            for(Books b : books){
                System.out.println(b.getTitle());
            }
        }

    }
}