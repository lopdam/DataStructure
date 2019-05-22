

/**
 *
 * @author lopdam
 */
public class DecimalBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Binary(3));
    }

    public static String Binary(int n) {

        int mod = n % 2;

        if(n==1){
        return "1";}

        else if(n==0){
            return "0";}


        if (mod == 1) {
            return Binary(n/2)+"1";
        } else {
            return Binary(n/2)+"0";
        }


    }

}
