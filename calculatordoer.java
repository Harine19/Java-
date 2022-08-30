import java.util.Scanner;
public class calculatordoer 
{
    public static void main(String[] args)    
    {
        calculator a = new calculator();
        //compilefile objname = new compilefile();
        
        int cho;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation : \n 1-Addition \n 2-Subtraction \n 3-Multiplication \n 4-Division \n Enter choice : ");
        cho = sc.nextInt();

        a.input();
       
        switch (cho) 
        {
        case 1:
            a.addition();            
            break;
        case 2:
            a.subtraction();
            break;
        case 3:
            a.multiplication();
      	    break;
        case 4:
            a.division();
            break;
    	default:
            System.out.println("No match"); 
        }
    }
}
