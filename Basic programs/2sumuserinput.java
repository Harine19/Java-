import java.util.Scanner;	
public class sumuserinput 
{
  public static void main(String[] args)
  {
  int x; int y; int sum=0;
  Scanner sc=new Scanner(System.in);
  
  System.out.print("Enter the first number: ");  
  x = sc.nextInt();  
  System.out.print("Enter the second number: ");  
  y = sc.nextInt();  

  sum=x+y;
  System.out.println("The sum of the 2 numbers you entered = "+sum);
}
}
