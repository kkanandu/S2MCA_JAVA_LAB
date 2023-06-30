import java.util.Scanner;
public class Temperature
{
public static void main(String[] args) {
Scanner input= new Scanner(System.in);
int choice;
do 
{
System.out.println("Enter your choice: ");
System.out.println("1. Celsius to Fahrenheit");
System.out.println("2. Fahrenheit to Celsius");
System.out.println("3. Exit");
choice = input.nextInt();
switch (choice) 
{
case 1:System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        break;
case 2:System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheitInput = input.nextDouble();
        double celsiusOutput = fahrenheitToCelsius(fahrenheitInput);
        System.out.println("Temperature in Celsius: " + celsiusOutput);
        break;
case 3:System.out.println("Exiting the code");
        break;
default:System.out.println("Invalid choice. Please try again.");
        break;
}
System.out.println();
} 
while (choice != 3);
}
public static double celsiusToFahrenheit(double celsius) 
{
return (celsius * 9 / 5) + 32;
}
public static double fahrenheitToCelsius(double fahrenheit) 
{
return (fahrenheit - 32) * 5 / 9;
}
}
