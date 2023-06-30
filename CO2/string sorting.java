import java.util.Arrays;
import java.util.Scanner;
public class StringSort 
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of strings: ");
int a = input.nextInt();
input.nextLine(); 
String[] names = new String[a];
for (int i = 0; i < a; i++) 
{
System.out.print("Enter string" + (i + 1) + ": ");
names[i] = input.nextLine();
}
System.out.println("\nBefore sorting:");
for (String name : names) 
{
System.out.println(name);
}
Arrays.sort(names);
System.out.println("\nAfter sorting:");
for (String name : names) 
{
System.out.println(name);
}
}
}
