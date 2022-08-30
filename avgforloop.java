import java.util.Scanner;
//user input + for loop 

public class avgforloop 
{ 
  public static void main (String[] args)
  {
  int[] nums={};
  int x; float sum=0; float avg=0; 
  Scanner sc=new Scanner(System.in);
  
  for(int i=1;i<=10;i++)
  {  
    System.out.print("Enter the number: ");  
    x = sc.nextInt();   
    sum+=x; 
  }

  avg=sum/10;
  System.out.println("The average is : "+avg);
  }
}