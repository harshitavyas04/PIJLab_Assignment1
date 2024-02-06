package assignment1_part2;

import java.util.ArrayList;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        ArrayList<Double> numberList = new ArrayList<>();
        while (true) {
            System.out.println("Mathematical Operations :");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. Variance");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Result: " + calc.addition(scanner.nextDouble(),
                            scanner.nextDouble()));
                    break;
                    case 2:
                        System.out.println("Result: " +
                                calc.subtraction(scanner.nextDouble(), scanner.nextDouble()));
                        break;
                    case 3:
                        System.out.println("Result: " +
                                calc.multiplication(scanner.nextDouble(), scanner.nextDouble()));
                        break;
                    case 4:
                        System.out.println("Result: " +
                                calc.div(scanner.nextDouble(), scanner.nextDouble()));
                        break;

                    case 5:
                        System.out.println("Result: " +
                                calc.sqrt(scanner.nextDouble()));
                        break;
                    case 6:
                        System.out.println("Result: " +
                                calc.power(scanner.nextDouble(), scanner.nextDouble()));
                        break;
                    case 7:
                        System.out.println("Enter numbers (type 'end' to finish):");
                        while (scanner.hasNextDouble()) {
                            numberList.add(scanner.nextDouble());
                        }

                        scanner.next();
                        double[] numbers = numberList.stream().mapToDouble(i -> i).toArray();

                        System.out.println("Mean: " + calc.mean(numbers));
                        numberList.clear();

                        break;
                    case 8:
                        System.out.println("Enter numbers (type 'end' to finish):");
                        while (scanner.hasNextDouble()) {
                            numberList.add(scanner.nextDouble());
                        }

                        scanner.next();
                        numbers = numberList.stream().mapToDouble(i -> i).toArray();
                        System.out.println("Variance: " + calc.variance(numbers));
                        numberList.clear();

                        break;
                    case 9:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 - 9.");
                }
            }
        }
    }


