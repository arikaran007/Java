public class Str3 {
    public static void main(String a[])
    {
        StringBuffer sb = new StringBuffer("arikarans");
        //System.out.println(sb.charAt(3));
        //System.out.println(sb.capacity());
        //System.out.println(sb.length());

        sb.append(" cse");

        sb.insert(0,"java ");

        System.out.println(sb);
    }
}
