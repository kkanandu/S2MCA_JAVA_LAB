import java.util.Scanner;
class validationException extends Exception
{
 validationException(String str)
{
   super(str);
}
}
 class User
{
  void check(String un,String pw)throws validationException
  {
   if(un.equals("anu")&&pw.equals("anu123"))
   {
    System.out.println("value Accepted");
   }
  else
  {
   throw new validationException("no match with the given values");
}
}
}
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
try
{
User us=new User();
System.out.println("enter username");
String u=sc.next();
System.out.println("enter pass");
String p=sc.next();
us.check(u,p);
System.out.println("login successful");
}

  catch(validationException e)
  {
    System.out.print("cannot find the symbols:--"+e);
}
}
}
