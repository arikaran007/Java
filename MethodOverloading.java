class Calculator{
    public int add(int n1,int n2,int n3)
    {
        return n1+n2;
    }
    public int add(int n1,int n2)
    {
        return n1 +n2;
    }
    public double add(double n1,double n2)
    {
        return n1 + n2;
    }
}

public class MethodOverloading {
    public static void main(String a[])
    {
        Calculator calc  = new Calculator();
        //int addition=calc.add(7,8,7);
        int addition=calc.add(4,3);
       // double addition=calc.add(4.2,3.9);
        System.out.println(addition);
        
    }     
}
