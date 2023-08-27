class Logical
{
    public static void main(String a[])
    {
        int num1 = 4;
        int num2 =6;
        int num3 = 9;
        int num4 = 6;
       // boolean result = num1<num2 && num3>num4;     two condition true only this code is run
       
    //   boolean result = num1>num2 || num3>num4;   //in this one condition is true this statement is run

        boolean result = num2!= num4;
        System.out.println(result);
    }
}