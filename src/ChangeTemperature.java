import java.util.Scanner;

public class ChangeTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double fahrenheit;
        double celsius;
        do{
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.printf("%.2f Fahrenheit is %.2f Celsius",fahrenheit,fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    celsius = sc.nextDouble();
                    System.out.printf("%.2f Celsius is %.2f Fahrenheit",celsius,celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println();
            System.out.println();
        }while (choice != 0);
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
            return celsius;
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
