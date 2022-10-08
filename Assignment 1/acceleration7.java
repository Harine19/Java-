import java.util.*;
class acceleration7 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float v0,v1,t,a;
        System.out.println("Enter initial velocity: ");
        v0=sc.nextFloat();
        System.out.println("Enter final velocity: ");
        v1=sc.nextFloat();
        System.out.println("Enter time taken: ");
        t=sc.nextFloat();
        sc.close();

        a=(v1-v0)/t;
        System.out.println("The average acceleration is : "+a);
    }
}

