import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator()
    {

    }
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Following operations are availale");
            System.out.print("1. Square root\n" +
                            "2. Factorial\n" +
                            "3. Natural Log\n" +
                            "4. Power\n" +
                            "0. Exit\n" +
                            "\nEnter your choice: ");
            int ch;
            double num, num1, num2;
            int number;
            try {
                ch = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            switch (ch) {
                case 1:
                    System.out.print("Enter number : ");
                    num = scanner.nextDouble();
                    System.out.println("Square root of " + num + " = " + calculator.sqrt(num));
                    break;
                case 2:
                    System.out.print("Enter number : ");
                    number = scanner.nextInt();
                    System.out.println("Factorial of " + number + " = " + calculator.fact(number));
                    break;
                case 3:
                    System.out.print("Enter number : ");
                    num = scanner.nextDouble();
                    System.out.println("Natural Log of " + num + " = " + calculator.nlog(num));
                    break;
                case 4:
                    System.out.print("Enter number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter power number : ");
                    num2 = scanner.nextDouble();
                    System.out.println(num1 + " to the power " + num2 + " = " + calculator.power(num1, num2));
                    break;
                default:
                    System.out.println("Exiting...");
                    return;
            }
            System.out.println();
        } while (true);
    }

    public double sqrt(double num)
    {
        logger.info("[SQUAREROOT] - " + num);
        double res = Math.sqrt(num);
        logger.info("[RESULT - SQUAREROOT] - " + res);
        return res;
    }

    public int fact(int num) {
        logger.info("[FACTORIAL] - " + num);
        int res = 1;
        for(int i=1;i<=num;i++)
            res = res * i;
        logger.info("[RESULT - FACTORIAL] - " + res);
        return res;
    }

    public double nlog(double num)
    {
        logger.info("[LOGBASEE] - " + num);
        double res = Math.log(num);
        logger.info("[RESULT - LOGBASEE] - " + res);
        return res;
    }

    public double power(double num1, double num2)
    {
        logger.info("[POWER] - " + num1 + ", " + num2);
        double res = Math.pow(num1, num2);
        logger.info("[RESULT - POWER] - " + res);
        return res;
    }
}

