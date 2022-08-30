//this program only compiles it does not run
//compiler file for addition

import java.util.Scanner;
public class additioncompile
{
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        void input()
        {
            System.out.println("Enter first number : ");
            a = sc.nextInt();
            System.out.println("Enter second number : ");
            b = sc.nextInt();
        }

        void calculate()
        {
            c=a+b;
            System.out.println("The addition of the two nos is : "+c);
        }
    
}
