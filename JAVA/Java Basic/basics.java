import java.util.*;
public class basics{
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");                      //Hello World

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Integers :");                   //Integer Input
        int a=sc.nextInt();
        System.out.println("Output " + a);

        System.out.print("Enter Floating Value :");             //Float Input
        float b=sc.nextFloat();
        System.out.println("Output "+b);
        
        System.out.print("Enter Characters :");                 //Character Input
        char ch=sc.next().charAt(0);
        System.out.println("Output "+ch);

    }
}