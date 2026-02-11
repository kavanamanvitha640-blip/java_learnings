import java.util.Scanner;
class example6{
    void greet(String name) {
        System.out.println("Hello"+ name);
    }
    public static void main(String[] args)  {
        Scanner scn=new Scanner(System.in);
        System.out.print("enter name:");
        String name=scn.nextLine();
        example6 obj=new example6();
        obj.greet(name);
    }
 }