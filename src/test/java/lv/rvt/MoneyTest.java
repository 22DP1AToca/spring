package lv.rvt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rvt.Exercises.Money.Money;

public class MoneyTest {
    @Test
    public void testPlusMethod(){
        Money mon1 = new Money(5, 10);
        Money mon2 = new Money(5, 10);
        Money result1 = mon1.plus(mon2);

        assertEquals(10, result1.euros());
        assertEquals(20, result1.cents());

        Money mon3 = new Money(2, 89);
        Money mon4 = new Money(3, 99);
        Money result2 = mon3.plus(mon4);

        assertEquals(6, result2.euros());
        assertEquals(88, result2.cents());
    }

    @Test
    public void testMinusMethod(){
        Money mon1 = new Money(2, 80);
        Money mon2 = new Money(1, 90);
        Money result1 = mon1.minus(mon2);

        assertEquals(0, result1.euros());
        assertEquals(90, result1.cents());

        Money mon3 = new Money(2, 80);
        Money mon4 = new Money(7, 30);
        Money result2 = mon3.minus(mon4);

        assertEquals(0, result2.euros());
        assertEquals(0, result2.cents());

        Money mon5 = new Money(1, 80);
        Money mon6 = new Money(1, 30);
        Money result3 = mon5.minus(mon6);

        assertEquals(0, result3.euros());
        assertEquals(50, result3.cents());
    }

    @Test
    public void testLessThanMethod(){
        Money mon1 = new Money(1, 66);
        Money mon2 = new Money(0, 41);
        boolean result1 = mon1.lessThan(mon2);

        assertEquals(false, result1);
        
        Money mon3 = new Money(4, 0);
        Money mon4 = new Money(4, 0);
        boolean result2 = mon3.lessThan(mon4);

        assertEquals(false, result2);
    }
}
