public class BinaryCalcLogic {
    public static int toDecimal(String binaryNum) {
        return Integer.parseInt(binaryNum,2);
    }
    public static String toBinary(int decimalNum){
        return Integer.toBinaryString(decimalNum);
    }
    public static int square(int decimalNum){
        return Math.round(decimalNum * decimalNum);
    }
    public static int squareroot(int decimalNum){
        if (decimalNum < 0){
            return 0;
        } else {
            return (int) Math.round(Math.sqrt(decimalNum));
        }
    }
}
