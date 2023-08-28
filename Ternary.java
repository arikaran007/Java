public class Ternary {
    public static void main(String a[])
    {
        int n=7;
    
/* 
        if (n%2==0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

*/
        String evenodd = (n%2==0) ?"even":"odd";   //?: ternary operator
        System.out.println(evenodd);
    }
}
