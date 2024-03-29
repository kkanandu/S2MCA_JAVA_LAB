import java.util.Scanner;
class CPU{
    int Price;
    CPU(int Price){
        this.Price=Price;
    }
    class Processor{
        int Cores;
        String Manufacturer;
        Processor(int Cores,String Manufacturer){
            this.Cores=Cores;
            this.Manufacturer=Manufacturer;
        }
        void Display(){
            System.out.println("Processor Informations");
            System.out.println("---------------------");
            System.out.println("Number of cores:"+Cores);
            System.out.println("Manufacturer:"+Manufacturer);
            System.out.println("---------------------");
        }
    }
    static class RAM{
        int Memory;
        String Manufacturer;
        RAM(int Memory,String Manufacturer){
            this.Memory=Memory;
            this.Manufacturer=Manufacturer;
        }
        void Display(){
            System.out.println("RAM Informations");
            System.out.println("---------------------");
            System.out.println("Memory:"+Memory);
            System.out.println("Manufacturer"+Manufacturer);
            System.out.println("---------------------");
        }
    }
    void Display(){
        System.out.println("Price:"+Price);
    }
    
}
class Main1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Price of cpu:");
        int p=sc.nextInt();
        System.out.println("Processor Informations");
        System.out.println("Enter Number of Cores:");
        int c=sc.nextInt();
        System.out.println("Enter name of Manufacturer:");
        String pm=sc.next();
        System.out.println("RAM Informations");
        System.out.println("Enter Memory size:");
        int s=sc.nextInt();
        System.out.println("Enter name of Manufacturer:");
        String rm=sc.next();
        CPU obj1=new CPU(p);
        CPU.Processor obj2=obj1.new Processor(c, pm);
        obj2.Display();
        CPU.RAM obj3=new CPU.RAM(s, rm);
        obj3.Display();
        obj1.Display();
    }
}
