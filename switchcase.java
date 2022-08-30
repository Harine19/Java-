public class switchcase {
    public static void main(String[] args)
    {
        String strno = "three";

        switch (strno) 
        {
        case "one":
            System.out.println("one");
            break;
        case "two":
            System.out.println("two");
            break;
        case "three":
            System.out.println("three");
      	    break;
    	default:
            System.out.println("No match"); 
        }
    }
}