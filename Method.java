class Computer{
    public void learner()
    {
        System.out.println("Programming language");
    }
    public String purchaseCourse(int cost)
    {
        if(cost>=1)
           return "paid course";
        else
           return "free course";   
    }
}

class Method{
    public static void main(String a[])
    {
        Computer com = new Computer();
        com.learner();
        String str = com.purchaseCourse(200);
        System.out.println(str);
    }
}
