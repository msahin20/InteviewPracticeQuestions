public class SumOfTheNumbersInAString {
    public static void main(String[] args) {
        String str ="123adf2kd3kf1kd12kdkd101";
        char ch;
        String strDigit="";
        int sum =0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                
                ch = str.charAt(j);
                if (Character.isDigit(ch)) {
                    strDigit += ch;

                }
                else {
                    break;
                }
            }
            //System.out.println("strDigit = " + strDigit);


            if(Character.isDigit(str.charAt(i))){

            sum += Integer.parseInt(strDigit);
            }
            i += strDigit.length();
            strDigit="";

        }
        System.out.println(sum);
        }
    }

