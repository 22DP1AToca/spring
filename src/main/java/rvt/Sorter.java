package rvt;

public class Sorter {
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int i : array) {
            if(i < smallest){
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        for(int i2 = 0; i2 < array.length; i2++){
            if(array[i2] == smallest(array)){
                return i2;
            }
        }
        return 0;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int[] newArray = new int[array.length - startIndex]; 
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = array[i + startIndex];
        }
    
        return indexOfSmallest(newArray) + startIndex;
    }
}
