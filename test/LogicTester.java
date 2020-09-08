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

}
