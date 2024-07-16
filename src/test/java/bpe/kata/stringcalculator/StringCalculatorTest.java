package bpe.kata.stringcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    @Disabled
    void step1_1 () throws NegativeException {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    @Disabled
    void step1_2 ()throws NegativeException{
        assertEquals(4, StringCalculator.add("4"));
    }

    @Test
    @Disabled
    void step1_3 ()throws NegativeException{
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    @Disabled
    void step2 ()throws NegativeException{
        assertEquals(45, StringCalculator.add("1,2,3,4,5,6,7,8,9"));
    }

    @Test
    @Disabled
    void step3 ()throws NegativeException{
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }

    @Test
    @Disabled
    void step4 ()throws NegativeException{
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }

    @Test
    @Disabled
    void step5 (){
        Exception exception = assertThrows(NegativeException.class, () -> {
            StringCalculator.add("1,-2,-3");
        });
    }

    @Test
    @Disabled
    void step6 ()throws NegativeException{
        assertEquals(2, StringCalculator.add("1001,2"));
    }

    @Test
    @Disabled
    void step7 ()throws NegativeException{
        assertEquals(6, StringCalculator.add("//[***]\n1***2***3"));
    }

    @Test
    @Disabled
    void step8 ()throws NegativeException{
        assertEquals(6, StringCalculator.add("//[*][%]\n1*2%3"));
    }

    @Test
    @Disabled
    void step9 ()throws NegativeException{
        assertEquals(6, StringCalculator.add("//[foo][bar]\n1foo2bar3"));
    }

}
