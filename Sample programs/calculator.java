import java.util.Scanner;
public class Calculator 
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);
Calculator calc = new Calculator();
while (true) 
{
System.out.println("Enter your choice ");
System.out.println("1. Add");
System.out.println("2. Substract");
System.out.println("3. Multiply");
System.out.println("4. Divide");
System.out.println("5. Exit");
int choice = input.nextInt();
if (choice == 5) 
{
System.out.println("Exiting calculator...");
break;
}
System.out.print("Enter the number: ");
double num1 = input.nextDouble();
System.out.print("Enter the number: ");
double num2 = input.nextDouble();
double result = 0;
switch (choice) {
case 1:result = calc.add(num1, num2);
        break;
case 2:result = calc.subtract(num1, num2);
        break;
case 3:result = calc.multiply(num1, num2);
        break;
case 4:result = calc.divide(num1, num2);
        break;
default:System.out.println("Invalid choice!");
}
System.out.println("Result: " + result + "\n");
}
}
public double add(double num1, double num2)
{
return num1 + num2;
}
public double subtract(double num1, double num2) 
{
return num1 - num2;
}
public double multiply(double num1, double num2) 
{
return num1 * num2;
}
public double divide(double num1, double num2) 
{
if (num2 == 0) 
{
System.out.println("Error: Cannot divide by zero!");
return Double.NaN;
}
return num1 / num2;
}
}
