import java.util.*;
import java.lang.Math;
public class distance5 
{
    public static void main(String[] args) 
    {
        int x1,y1,x2,y2;
        double dist=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x1 coordinate: ");
        x1 = sc.nextInt();
        System.out.println("Enter y1 coordinate: ");
        y1 = sc.nextInt();
        System.out.println("Enter x2 coordinate: ");
        x2 = sc.nextInt();
        System.out.println("Enter y2 coordinate: ");
        y2 = sc.nextInt();

        dist=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.println(String.format("The distance is : %.2f ",dist));
        sc.close();
    }
}
