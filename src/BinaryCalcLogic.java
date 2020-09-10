public class BinaryCalcLogic {
    public static int toDecimal(String binaryNum) {
        return Integer.parseInt(binaryNum,2);
    }
    public static String toBinary(int decimalNum){
        return Integer.toBinaryString(decimalNum);
    }
    public static int addition(int Num1, int Num2){ return Num1 + Num2;}
    public static int subtraction(int Num1, int Num2){ return Num1 - Num2;}
}
