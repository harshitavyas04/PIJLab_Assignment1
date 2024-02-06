package assignment1_part2;

public class Calculator {
    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            System.err.println("Not defined. Incorrect input");
        }
        return a / b;
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double mean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public double variance(double[] numbers) {
        double mean = mean(numbers);
        double temp = 0;
        for (double num : numbers) {
            temp += (num - mean) * (num - mean);
        }
        return temp / numbers.length;
    }
}


