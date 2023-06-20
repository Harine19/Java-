import java.util.*;
class time10
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int d,h,m,s,ss;

        System.out.println("Enter days: ");
        d=sc.nextInt();
        System.out.println("Enter hours: ");
        h=sc.nextInt();
        System.out.println("Enter minutes: ");
        m=sc.nextInt();
        System.out.println("Enter seconds: ");
        s=sc.nextInt();
        sc.close();
        
        ss=(d*86400)+(h*3600)+(m*60)+s;
        System.out.println(String.format("The total seconds for %d days %d hours %d minutes and %d seconds is : %d ",d,h,m,s,ss));
        //System.out.print(" : "+ss);
    }
}

