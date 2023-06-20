import java.util.Scanner;
class sum9
{
    public static void main(String[] args)
    {
        int r;
        int s=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        sc.close();
       
        while(n>0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        System.out.println("The sum of the digits is : "+s);
    }
}



