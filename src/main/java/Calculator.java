import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
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
            try {
                ch = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            switch (ch) {
                case 1:
                    calculator.sqrt();
                    break;
                case 2:
                    calculator.fact();
                    break;
                case 3:
                    calculator.nlog();
                    break;
                case 4:
                    calculator.power();
                    break;
                default:
                    System.out.println("Exiting...");
                    return;
            }
            System.out.println();
        } while (true);
    }

    public void sqrt()
    {
        double num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        num = scanner.nextDouble();
        System.out.println("Square root of " + num + " = " + Math.sqrt(num));
    }

    public void fact() {
        double num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        num = scanner.nextDouble();
        int ans = 1;
        for(int i=1;i<=num;i++)
            ans = ans * i;
        System.out.println("Factorial of " + num + " = " + ans);
    }


    public void nlog() {
        double num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        num = scanner.nextDouble();
        System.out.println("Natural Log of " + num + " = " + Math.log(num));
    }

    public void power() {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        num1 = scanner.nextDouble();
        System.out.print("Enter power number : ");
        num2 = scanner.nextDouble();
        System.out.println(num1 + " to the power " + num2 + " = " + Math.pow(num1, num2));
    }
}

