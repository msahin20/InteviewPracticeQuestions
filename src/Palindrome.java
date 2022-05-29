public class Palindrome {
    public static void main(String[] args) {
        String str = "dada";
        //System.out.println(reverse(str));
        if(str.equalsIgnoreCase(reverse(str))){
            System.out.println(str + " is a Palindrome word");
       }




//        StringBuffer str2 = new StringBuffer(str);
//
//
//        if(str.equalsIgnoreCase(str2.reverse().toString())){
//            System.out.println(str2 + " is a Palindrome word");
//        }
    }


    public static String reverse(String str) {
                String str2="";

        for (int i = str.length()-1; i >=0; i--) {
            str2+=str.charAt(i);

        }
        return str2;

    }
}