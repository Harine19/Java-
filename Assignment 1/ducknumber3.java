import java.util.Scanner;
public class ducknumber3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        String nstr = sc.nextLine();   //taking number as string 
        sc.close();
        int l = nstr.length();
        int ctr = 0;
        char chr;

        for (int i = 1; i < l; i++) {    
            chr = nstr.charAt(i);
            if (chr == '0')
                ctr++;
        }

        char f = nstr.charAt(0);    //checking if 0 at 1st index
        if (ctr > 0 && f != '0')
            System.out.println("Duck number");
        else
            System.out.println("Not a duck number");
    }

}