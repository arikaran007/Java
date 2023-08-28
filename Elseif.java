public class Elseif {
    public static void main(String a[])
    {
        int x=34;
        int y=45;
        int z=23;

        if (x>y && x>z)
        {
            System.out.println("x is big");
        }
        else if(y>z)
        {
            System.out.println("y is big");
        }
        else
        {
            System.out.println("z is big");
        }
    }
    
}
