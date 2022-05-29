public class Finra {
    public static void main(String[] args) {
        for (int i = 1; i <31 ; i++) {
            if ((i%3==0)&&(i%5!=0)) {
                System.out.print("FIN");
                System.out.print(" ");
            }
            else if ((i%5==0)&&(i%3!=0)) {
                System.out.print("RA");
                System.out.print(" ");
            }
            else if (i%15==0) {
                System.out.print("FINRA");
                System.out.print(" ");
            }
            else{
                System.out.print(i);
                System.out.print(" ");
                }




        }
    }
}
