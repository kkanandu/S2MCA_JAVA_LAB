import java.util.Scanner;
class Student
{
int roll_no,mark;
String name;
void get()
{
Scanner input=new Scanner(System.in);
System.out.println("enter the name:");
name=input.next();
System.out.println("enter the rollno");
roll_no=input.nextInt();
System.out.println("enter the mark");
mark=input.nextInt();
}

class Sports
{
String sprts_name;
int actvty_point;
void get()
{
Scanner input=new Scanner(System.in);
System.out.println("enter the sports name");
sprts_name=input.next();
System.out.println("enter the activity point");
actvty_point=input.nextInt();
}
void display()
{
System.out.println("...................");
System.out.println("student name:"+name);
System.out.println("student rollno:"+roll_no);
System.out.println("student mark:"+mark);
System.out.println("student name:"+sprts_name);
System.out.println("student rollno:"+actvty_point);
System.out.println("..................");


}
}
}
class Main
{
public static void main(String [] args)
{
Student obj=new Student();
Student.Sports obj2= obj.new Sports();
obj.get();
obj2.get();
obj2.display();
}
}
