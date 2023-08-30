public class Switch {
    public static void main(String a[])
    {
        int n=87;
        n=n/10;
        switch(n)
        {
            case 10:
               System.out.println("A");
               break;
            case 9:
               System.out.println("B");
               break;
            case 8:
               System.out.println("c");
               break;
            case 7:
               System.out.println("D");
               break;
            default:
               System.out.println("invalid");            
        }
    }
}
