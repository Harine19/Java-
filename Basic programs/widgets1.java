import java.util.Scanner;
public class widgets1
{
  public static void main(String[] args)
  {
  //widget=75grams, gizmo=112grams
  int w=75; int g=112; double weight; 
  int wno; int gno;

  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of widgets: ");
  wno = sc.nextInt();
  System.out.println("Enter number of gizmos: ");
  gno = sc.nextInt();
  sc.close();  
  weight = (((w*wno)+(g*gno))*0.001);
  
  String weightstr=String.format("The number of widgets is "+wno+" and the number of gizmos is "+gno+" and the total weight is : %.3f kilograms",weight);
  System.out.println(weightstr);
}
}
