public class BinaryCalcLogic {
    public static int toDecimal(String binaryNum) {
        return Integer.parseInt(binaryNum,2);
    }
    public static String toBinary(int decimalNum){
        return Integer.toBinaryString(decimalNum);
    }

}
