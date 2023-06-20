import java.util.Scanner;
public class composite6 {
    public static void main(String[] args) {
        int f=0; 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        sc.close();
        
        for (int i=1;i<n;i++) {
            if(n%i==0) {
                f=f+1;
            }
        }
        if (f>2) {
            System.out.println("Composite");
        }
        else {
            System.out.println("Not composite");
        }
    }
};



