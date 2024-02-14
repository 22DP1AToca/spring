package rvt.Exercises.InterfaceInABox;

public class CD implements Packable{
    public String artist;
    public String cdName;
    public int publicationYear;
    public double weight;

    public CD(String artist, String cdName, int publicationYear){
        this.artist = artist;
        this.cdName = cdName;
        this.publicationYear = publicationYear;
    }

    public double weight(){
        weight = 0.1;
        return weight;
    }

    public String toString(){
        return artist + ": " + cdName;
    }
}
