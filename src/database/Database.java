package database;

public class Database {

    private String sku = "";
    private String title = "";
    private String author = "";
    private String description = "";
    private double price = 0;

    public Database(){

    }

    public Database(String title, String author, String description, double price){
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
    }

    public String toString()
    {
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nDescription: " + this.description + "\nPrice: " +this.price;
    }
}
