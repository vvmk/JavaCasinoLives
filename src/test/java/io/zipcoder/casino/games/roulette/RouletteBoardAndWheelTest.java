package io.zipcoder.casino.games.roulette;

import org.junit.Assert;
import org.junit.Test;

public class RouletteBoardAndWheelTest {
    RouletteBoardAndWheel rouletteBoardAndWheel = new RouletteBoardAndWheel();

    @Test
    public void columnTest1() {
        Integer[] actual = rouletteBoardAndWheel.columnSelection(1);
        Integer[] expected = {1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34};
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void columnTest2() {
        Integer[] actual = rouletteBoardAndWheel.columnSelection(2);
        Integer[] expected = {2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35};
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void columnTest3() {
        Integer[] actual = rouletteBoardAndWheel.columnSelection(3);
        Integer[] expected = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void twelveNumberBetTest1() {
        Integer[] actual = rouletteBoardAndWheel.twelveNumberBet(1);
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void twelveNumberBetTest2() {
        Integer[] actual = rouletteBoardAndWheel.twelveNumberBet(2);
        Integer[] expected = {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void twelveNumberBetTest3() {
        Integer[] actual = rouletteBoardAndWheel.twelveNumberBet(3);
        Integer[] expected = {25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void oddNumbersTest() {
        Integer[] actual = rouletteBoardAndWheel.oddNumberSet();
        Integer[] expected = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35};
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void evenNumbersTest() {
        Integer[] actual = rouletteBoardAndWheel.evenNumberSet();
        Integer[] expected = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void blackNumbersTest() {
        Integer[] actual = rouletteBoardAndWheel.blackNumberSet();
        Integer[] expected = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void redNumbersTest() {
        Integer[] actual = rouletteBoardAndWheel.redNumberSet();
        Integer[] expected = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void generateWinningNumberTest1() {
        Integer output = null;
        try {
            output = rouletteBoardAndWheel.generateWinningNumber();
        } catch (InterruptedException e) {
        }

        Assert.assertNotEquals(null, output);
    }

    @Test
    public void generateWinningNumberTest2() {
        Integer output = null;
        try {
            output = rouletteBoardAndWheel.generateWinningNumber();
        } catch (InterruptedException e) {
        }

        Assert.assertTrue(output < 37 && output >= 0);
    }
}
