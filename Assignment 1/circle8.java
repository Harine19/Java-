import java.util.*;
import java.lang.Math;
class circle8
{
    public static void main(String[] args)
{
        Scanner sc=new Scanner(System.in);
        double r,p;
        System.out.println("Enter radius of circle: ");
        r=sc.nextDouble();
        sc.close();
        
        p=2*Math.PI*r;
        System.out.println(String.format("The perimeter of the circle is %.2f",p));
    }
}

