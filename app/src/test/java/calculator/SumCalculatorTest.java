package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator calc;
    @BeforeEach
    public void beforeEach(){
         calc = new SumCalculator();
    }

    @Test
    public void thatSumFor1WorksCorrectly(){
        int actual = calc.sum(1);
        Assertions.assertEquals(1,actual);
    }

    @Test
    public void thatSumFor3WorksCorrectly(){
        int actual = calc.sum(3);
        Assertions.assertEquals(6,actual);
    }

    @Test
    public void thatSumFor0WorksCorrectly(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(0);
        });
    }
}