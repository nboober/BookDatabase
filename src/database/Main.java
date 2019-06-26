package database;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String SKU = "";
        ArrayList<Object> books = new ArrayList<Object>();

        Database book1 = new Database("Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50);
        books.add(book1);

        Database book2 = new Database("Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20.00);
        books.add(book2);

        Database book3 = new Database("OCP: Oracle Certified Professional Java SE","Jeanne Boyarsky", "Everything you need to know in one place", 45.00);
        books.add(book3);

        Database book4 = new Database("Automate the Boring Stuff with Python","Al Sweigart", "Fun with Python", 10.50);
        books.add(book4);

        Database book5 = new Database("The Maker's Guide to the Zombie Apocalypse","Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50);
        books.add(book5);

        Database book6 = new Database("Raspberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75);
        books.add(book6);


        System.out.println("Enter the SKU number for the book you want. \nYour options are (Java1001, Java1002, Orcl1003, Python1004, Zombie1005, Rasp1006) : ");
        SKU = scanner.next();

        switch(SKU){
            case "Java1001":
                System.out.println(books.get(0).toString());

                break;

            case "Java1002":
                System.out.println(books.get(1).toString());

                break;

            case "Orcl1003":
                System.out.println(books.get(2).toString());

                break;

            case "Python1004":
                System.out.println(books.get(3).toString());

                break;

            case "Zombie1005":
                System.out.println(books.get(4).toString());

                break;

            case "Rasp1006":
                System.out.println(books.get(5).toString());

                break;
            default:
                System.out.println("That is not an option.");
        }

    }

}
