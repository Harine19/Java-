import java.util.Scanner;
public class widgets
{
  public static void main(String[] args)
  {
  //widget=75grams, gizmo=112grams
  int w=75; int g=112; double weight; double roundoff;
  int wno; int gno;

  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of widgets: ");
  wno = sc.nextInt();
  System.out.println("Enter number of gizmos: ");
  gno = sc.nextInt();

  weight = (((w*wno)+(g*gno))*0.001);
  
  String weightstr=String.format("The number of widgets is "+wno+" and the number of gizmos is "+gno+" and the total weight is : %.1f kilograms",weight);
  System.out.println(weightstr);
}
}
