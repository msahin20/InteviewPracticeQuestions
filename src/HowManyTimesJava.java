import java.util.Arrays;

public class HowManyTimesJava {
    // Write a program that will count how many times "java" is found in any String

    public static void main(String[] args) {
        String str = "Kac defa java feciyor ki java sayisini javada sayJAVA";
        int count=0;
        //System.out.println(str.substring(0,4));
        for (int i = 0; i < str.length()-3; i++) {
            if(str.substring(i,i+4).equalsIgnoreCase("java")){
                count++;

        }





        }
        System.out.println(count);
    }
}
