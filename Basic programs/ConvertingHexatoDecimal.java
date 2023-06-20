import java.util.*;
public class hexatodecimal4 {
public static void main(String[] args) {
    hextodecimall();
}

public static boolean check(String hexa) {   //function that checks if number is hexadecimal 
    int len=hexa.length();
    for(int i=0; i<len;i++) {
        char a=hexa.charAt(i);

        if(a=='A'||a=='B'||a=='C'||a=='D'||a=='E'||a=='F'||a=='0'||a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9')
            continue;
        else
            return false;
    }
    return true;
}

public static void hextodecimall () {    //function that converts hexa to decimal and prints it 
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Hexadecimal number: ");
    String hexa= sc.nextLine();
    hexa = hexa.toUpperCase();
    sc.close(); 

    try
    {
        if(!check(hexa))
            throw new NumberFormatException();
        Integer resultindecimal = Integer.parseInt(hexa,16);
        System.out.println("The decimal value is : "+resultindecimal);
    }
    catch (NumberFormatException e)
    {
        System.out.print(e);
    }
}
}

