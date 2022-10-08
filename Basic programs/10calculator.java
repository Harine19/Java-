//compiler file for calculator methods

import java.util.Scanner;
public class calculator 
{
    int a,b,c;
    int cho;
    Scanner sc = new Scanner(System.in);

    void input()
    {
        System.out.println("Enter first number : ");
        a = sc.nextInt();
        System.out.println("Enter second number : ");
        b = sc.nextInt();
    }

    void addition()
    {
        c=a+b;
        System.out.println("The addition of the two nos is : "+c);
    }

    void subtraction()
    {
        c=a-b;
        System.out.println("The subtraction of the two nos is : "+c);
    }

    void multiplication()
    {
        c=a*b;
        System.out.println("The multiplication of the two nos is : "+c);
    }

    void division()
    {
        c=a/b;
        System.out.println("The division of the two nos is : "+c);
    }


}
