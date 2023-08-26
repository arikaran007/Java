public class Assignment {
    public static void main(String a[])
    {
        int d = 5;
        System.out.println(d);

        int num =4;
       // num+=2;
        //num-=2;
      //  num*=2;
        //num/=2;
        num%=2;
        System.out.println(num);

        int e = 5;
      //  e &=3;  //and
       // e ^=3;   //x-or
       // e |=3;  //or
       // e<<=3;  //left shift
        e>>=3;  //right shift
        System.out.println(e);
        

        int num1 = 3;
      //  num1++;
        ++num1;
        System.out.println(num1);

        //post increment

        int num2 = 5;
        int result = num2++;
        System.out.println(result); 

        // pre  increment

        int num3 =5;
        int result1 = ++num3;
        System.out.println(result1);
    }
}
