public class NewSwitch {
    public static void main(String a[])
    {
        String day = "monday";
        String num = "";
      
            
         switch(day)
        {
          /*   case "monday" -> System.out.println("7am");

            case "sunday"  -> System.out.println("8am");   */

            case "monday" -> num ="7am";

            case "sunday"  -> num ="8am";

            default ->  num = "9am";

              //yield are not used in this java version
         
        }
        System.out.println(num);
    }
}
