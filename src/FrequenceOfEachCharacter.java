import java.util.Locale;

public class FrequenceOfEachCharacter {
    public static void main(String[] args) {
        String str = "America";
        str= str.toLowerCase();
        String strUnique="";
        char ch;
        int count=0;


        for (int i = 0; i <str.length() ; i++) {
            ch= str.charAt(i);

            if (!strUnique.contains(ch+"")){


              for (int j = 0; j < str.length(); j++) {
                if((ch==str.charAt(j))){
                    count++;
                }

            }
            System.out.print(ch + " ");
            System.out.print(count + " ");
            count =0;
            strUnique+=ch;

        }
       }
    }
}
