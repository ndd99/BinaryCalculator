import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogicTester {
    @Test
    public void testToDecimal(){
        int result=BinaryCalcLogic.toDecimal("1111");
        assertEquals(15,result);
    }
    @Test
    public void testToBinary(){
        String result=BinaryCalcLogic.toBinary(15);
        assertEquals("1111",result);
    }
    @Test
    public void testnormalSquare(){
        int result=BinaryCalcLogic.square(9);
        assertEquals(81,result);
    }
    @Test
    public void testnegativeSquare(){
        int result=BinaryCalcLogic.square(-6);
        assertEquals(36,result);
    }
    @Test
    public void testzeroSquare(){
        int result=BinaryCalcLogic.square(0);
        assertEquals(0,result);
    }
    @Test
    public void testnormalSquareroot(){
        int result=BinaryCalcLogic.squareroot(81);
        assertEquals(9,result);
    }
    @Test
    public void testnegativeSquareroot(){
        int result=BinaryCalcLogic.squareroot(-112);
        assertEquals(0,result);
    }
    @Test
    public void testzeroSquareroot(){
        int result=BinaryCalcLogic.squareroot(0);
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
}
