import java.util.Scanner;
public class signofint2 {
  public static void main(String[] args)
  {
  
  int num=0;

  Scanner sc =new Scanner(System.in);
  System.out.println("Enter an integer: ");
  num = sc.nextInt();
  sc.close();
  if (num>0)
  System.out.println("Positive");
  else if (num<0)
  System.out.println("Negative");
  else 
  System.out.println("Zero");  
}
} 
