import java.util.Scanner;	
public class age4 
{
    public static void main(String[] args) {
    int age =0;
	Scanner sc=new Scanner(System.in);
	sc.close();
	
  	System.out.print("Enter age: ");  
  	age = sc.nextInt();  

        if (age<0) {
	    System.out.print("Invalid"); }
	else if (age>=1 && age<=11) {
	    System.out.print("You are young"); }
	else if (age>=12 && age<=18) {
	    System.out.println("You are a teen"); }
	else {
	    System.out.println("You are old"); }

    }
}
