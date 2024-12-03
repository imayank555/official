import java.util.*;
public class basic_programs{
    public static void main(String args[]){
        
      //Sum of Two Numbers(Input from User)

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first value :");
        int a=sc.nextInt();
        System.out.print("Enter second value :");
        int b=sc.nextInt();
        System.out.println("Then Sum will be :"+(a+b));

      //Product of Two Numbers(Input from User)

        System.out.println("First Multiple :");
        int c=sc.nextInt();
        System.out.println("Second Multiple :");
        int d=sc.nextInt();
        System.out.println("Then Multiplication will be :"+(c*d));

      //Area of Circle

      System.out.println("Enter Radius :");
      float rad=sc.nextFloat();
      float area=3.14f*rad*rad;                       //(3.14-->double : 3.14f-->float)
      System.out.println("Area of circle is :"+area);


    }
}