package lv.rvt;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import rvt.Exercises.Sorter.Sorter;

public class SorterTest {
    @Test
    public void smallestTest(){
        int[] intArray = {6, 5, 8, 7, 11};
        assertEquals(5, Sorter.smallest(intArray));
    } 
    
    @Test
    public void indexOfSmallestTest(){  
        int[] numbers = {6, 5, 8, 7, 11};
        assertEquals(1, Sorter.indexOfSmallest(numbers));
    } 

    @Test
    public void indexOfSmallestFromTest(){
        int[] numbers = {-1, 6, 9, 8, 12};
        assertEquals(0, Sorter.indexOfSmallestFrom(numbers, 0));
        assertEquals(1, Sorter.indexOfSmallestFrom(numbers, 1));
        assertEquals(3, Sorter.indexOfSmallestFrom(numbers, 2));
        assertEquals(3, Sorter.indexOfSmallestFrom(numbers, 3));
        assertEquals(4, Sorter.indexOfSmallestFrom(numbers, 4));
    }
    
    @Test
    public void swapTest(){
        int[] numbers = {3, 2, 5, 4, 8};
        assertArrayEquals(new int[]{3, 2, 5, 4, 8}, numbers);

        Sorter.swap(numbers, 1, 0);
        assertArrayEquals(new int[]{2, 3, 5, 4, 8}, numbers);

        Sorter.swap(numbers, 0, 3);
        assertArrayEquals(new int[]{4, 3, 5, 2, 8}, numbers);
    }

    @Test
    public void sortTest(){
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        Sorter.sort(numbers);

        assertArrayEquals(new int[]{1, 2, 3, 4, 7, 8, 9}, numbers);
    }
}
