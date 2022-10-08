import java.util.*;
class taxandtip12
{
    public static void main(String[] args)
    {
        double meal,tax,tip,tot;
        Scanner sc=new Scanner(System.in);
        System.out.print
        ("Enter cost of the meal: ");
        meal=sc.nextDouble();
        sc.close();
        
        tax=0.05*meal;
        tip=0.18*meal;
        tot=tax+meal+tip;
        System.out.println("Meal = "+meal);
        System.out.println("Tax = "+tax);
        System.out.println("Meal Tax = "+(tax+meal));
        System.out.println(String.format("Tips = %.2f",tip));
        System.out.println("Total cost = "+tot);
    }
}

