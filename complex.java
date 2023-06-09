class Complex
{
int r,i;
Complex(int r,int i)
{
this.r=r;
this.i=i;
}
void Display()
{
System.out.println(this.r+"+"+this.i+"i");
}
Complex Add(Complex c1,Complex c2){
Complex temp=new Complex(0,0);
temp.r=c1.r+c2.r;
temp.i=c1.i+c2.i;
return temp;
}
}
class Main{
public static void main(String args[]){
Complex c1=new Complex(2,05);
Complex c2=new Complex(4,11);
System.out.println("Enter the First Comp ex Number:");
c1.Display();
System.out.println("Enter the Second Complex Number:");
c2.Display();
Complex c3=new Complex(0,0);
c3=c3.Add(c1,c2);
System.out.println("Sum is:"+c3.r+"+"+c3.i+"i");
}
}

