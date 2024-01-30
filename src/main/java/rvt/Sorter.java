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
        for(int i = 0; i < array.length; i++){
            if(array[i] == smallest(array)){
                return i;
            }
        }
        return 0;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int[] newArray = new int[array.length - startIndex]; 
        for(int i = startIndex; i < newArray.length; i++){
            newArray[i] = array[i];
        }

        return indexOfSmallest(newArray);
    }
}
