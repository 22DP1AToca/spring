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
        return -1;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int[] newArray = new int[array.length - startIndex]; 
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = array[i + startIndex];
        }
    
        return indexOfSmallest(newArray) + startIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temporary = array[index1];

        array[index1] = array[index2];
        array[index2] = temporary;
    }

    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++){
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}
