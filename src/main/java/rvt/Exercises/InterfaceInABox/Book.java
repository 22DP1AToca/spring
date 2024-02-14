package rvt.Exercises.InterfaceInABox;

public class Book implements Packable{
    public String author;
    public String bookName;
    public double weight;

    public Book(String author, String bookName, double weight){
        this.author = author;
        this.bookName = bookName;
        this.weight = weight;
    }

    public double weight(){
        return weight;
    }

    public String toString(){
        return author + ": " + bookName;
    }
}