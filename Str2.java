public class Str2 {
    public static void main(String a[])
    {
        // String is immutable
        String name ="ari";  //it address 101  --> it afer sometimes it will be a garbage value
        name = name + "karan";

        System.out.println(name);  // it create new object and its address is 103
    }



}
