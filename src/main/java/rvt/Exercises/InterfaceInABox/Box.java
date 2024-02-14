package rvt.Exercises.InterfaceInABox;

public class Box{
    public double maxWeight;
    public double weight = 0;
    public int items = 0;

    public Box(double maxWeight){
        this.maxWeight = maxWeight;
    }

    public double weight() {
        double weight = 0;
        // calculate the total weight of the items in the box
        return weight;
    }
    
    public void add(Book book){
        if(weight + book.weight() <= maxWeight){
            items++;
            weight = weight + book.weight();
        }
    }

    public void add(CD cd){
        if(weight + cd.weight() <= maxWeight){
            items++;
            weight = weight + cd.weight();
        }
       
    }

    public String toString(){
        return "Box: " + items + " items, total weight " + weight + " kg";
    }
}
