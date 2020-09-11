import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogicTester {
    @Test
    public void testToDecimal(){
        int result=BinaryCalcLogic.toDecimal("1111");
        assertEquals(15,result);
    }
    @Test
    public void testToDecimalNegative(){
        int result=BinaryCalcLogic.toDecimal("-1111");
        assertEquals(-15,result);
    }
    @Test
    public void testToBinary(){
        String result=BinaryCalcLogic.toBinary(15);
        assertEquals("1111",result);
    }
    @Test
    public void testToBinaryNegative(){
        String result=BinaryCalcLogic.toBinary(-15);
        assertEquals("-1111",result);
    }
    @Test
    public void testNormalSquare(){
        int result=BinaryCalcLogic.square(9);
        assertEquals(81,result);
    }
    @Test
    public void testNegativeSquare(){
        int result=BinaryCalcLogic.square(-6);
        assertEquals(36,result);
    }
    @Test
    public void testZeroSquare(){
        int result=BinaryCalcLogic.square(0);
        assertEquals(0,result);
    }
    @Test
    public void testNormalSquareRoot(){
        int result=BinaryCalcLogic.squareRoot(81);
        assertEquals(9,result);
    }
    @Test
    public void testNegativeSquareRoot(){
        int result=BinaryCalcLogic.squareRoot(-112);
        assertEquals(0,result);
    }
    @Test
    public void testZeroSquareRoot(){
        int result=BinaryCalcLogic.squareRoot(0);
        assertEquals(0,result);
    }
    @Test
    public void testAddition(){
        int result = BinaryCalcLogic.addition(5,7);
        assertEquals(12, result);
    }
    @Test
    public void testSubtraction(){
        int result = BinaryCalcLogic.subtraction(5,7);
        assertEquals(-2, result);
    }
    @Test
    public void testDivision(){
        int result = BinaryCalcLogic.division(20,5);
        assertEquals(4, result);
    }
    @Test
    public void testMultiplication(){
        int result = BinaryCalcLogic.multiplication(6,3);
        assertEquals(18, result);
    }
}
