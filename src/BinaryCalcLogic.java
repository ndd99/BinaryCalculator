public class BinaryCalcLogic {
    public static int toDecimal(String binaryNum) {
        return Integer.parseInt(binaryNum,2);


    }
    public static String toBinary(int decimalNum){
        if (decimalNum>0){
            return Integer.toBinaryString(decimalNum);
        }else{
            decimalNum=decimalNum*-1;
            return "-"+Integer.toBinaryString(decimalNum);
        }
    }

    public static int square(int decimalNum){
        return Math.round(decimalNum * decimalNum);
    }
    public static int squareRoot(int decimalNum) {
        if (decimalNum < 0) {
            return 0;
        } else {
            return (int) Math.round(Math.sqrt(decimalNum));
        }
    }
    public static int addition (int Num1, int Num2){
        return Num1 + Num2;
    }
    public static int subtraction (int Num1, int Num2){
        return Num1 - Num2;
    }

    public static int division(int Num1, int Num2){return Num1 / Num2;}
    public static int multiplication(int Num1, int Num2){return Num1 * Num2;}

}
