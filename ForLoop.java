public class ForLoop {
    public static void main(String a[])
    {
        for(int i=1;i<=4;i++)
        {
            System.out.println("day" +i);
            for(int j=1;j<=9;j++)
            {
                if(j>4)
                {
                    System.out.println(" "+(j-4)+" - "+(j-3));
                }
                else{
                    System.out.println(" "+(j+8)+" - "+(j+9));

                }

      

            }
        }
    }
}
