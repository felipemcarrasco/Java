public class MyStrings{
  public static void main(String args[])
    {
        String s1 = new String("Water!");
        String s2 = new String("Fire!");
        String s3 = new String("Earth!");
        String s4 = new String("Air!");
        String s5 = new String();
        int stringSize = 0;
        int stringCmp = 0;
        String s6 = new String("Water!");
        String upper = new String();
        String replace = new String();
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        s5 = s1.concat(s2+s3+s4);
        System.out.println("Concatenate String = " + s5);

        stringSize = s5.length();
        System.out.println("Size of String = " + stringSize);

        stringCmp = s1.compareTo(s6);
        if (stringCmp == 0){
          System.out.println("Equal String");
        }else{
          System.out.println("Different String");
        }

        upper = s1.toUpperCase();
        System.out.println("Upper Case String = " + upper);

        replace = s1.replace('!','?');
        System.out.println("Replace ! for ? = " + replace);
    }
}