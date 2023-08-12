public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int x = 10;
        int y = 5;

        System.out.println("Addition: " + calculator.add(x, y));
        System.out.println("Subtraction: " + calculator.subtract(x, y));
        System.out.println("Multiplication: " + calculator.multiply(x, y));
        System.out.println("Division: " + calculator.divide(x, y));
    }
}
