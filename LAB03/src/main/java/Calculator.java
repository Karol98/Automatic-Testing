public class Calculator {

    public int adding(int a, int b) {
        return a + b;
    }

    public int substracting(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        if (a == 0 || b == 0)
            throw new ArithmeticException();
        return a / b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public boolean compareTheNumbers(int a, int b) {
        return a == b;
    }
}