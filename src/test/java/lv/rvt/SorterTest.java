package lv.rvt;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import rvt.MainProgram;
import rvt.Sorter;

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
    } 
}
