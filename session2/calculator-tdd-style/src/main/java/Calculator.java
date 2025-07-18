public class Calculator {
    // methods the following Java numerical data types, int, long, short, float, double
//    add(a, b)
//    subtract(a, b)
//    multiply(a, b)
//    divide(a, b) // catch division by 0 excepion. for float and double, assume that you have 4 digits of precision

    private boolean isOn;

    public Calculator() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    // Addition
    public int add(int num1, int num2) {
        return num1 +num2;
    }

    public short add (short num1, short num2){
        return (short) (num1 + num2);
    }

    public long add (long num1, long num2){
        return Long.sum(num1, num2);
    }

    public double add (double num1, double num2) {
        return num1 + num2;
    }

    public float add (float num1, float num2) {
        return num1 + num2;
    }


    // Subtraction
    public int subtract (int num1, int num2) {
        return num1 - num2;
    }

    public double subtract (double num1, double num2) {
        return num1 - num2;
    }

    public float subtract (float num1, float num2) {
        return num1 - num2;
    }

    public short subtract (short num1, short num2) {
        return (short) (num1 - num2);
    }

    public long subtract (long num1, long num2){
        return Math.subtractExact(num1, num2);
    }


    // Multiplication
    public int multiply (int num1, int num2) {
        return num1 * num2;
    }

    public double multiply (double num1, double num2) {
        return num1 * num2;
    }

    public float multiply (float num1, float num2) {
        return num1 * num2;
    }

    public short multiply (short num1, short num2) {
        return (short) (num1 * num2);
    }

    public long multiply (long num1, long num2) {
        return Math.multiplyExact (num1, num2);
    }

    // Division
    public int division (int num1, int num2) {
        return num1 / num2;
    }

    public double division (double num1, double num2) {
        return num1 / num2;
    }

    public float division(float num1, float num2) {
        return num1 / num2;
    }

    public short division(short num1, short num2) {
        return (short) (num1 / num2);
    }

    public long division(long num1, long num2) {
        return Math.divideExact(num1, num2);
    }

}