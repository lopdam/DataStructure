
/**
 *
 * @author lopdam
 */
public class SumaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = {1, 2, 3, 4};

        System.out.println(String.valueOf(SumaMedios(arreglo,0, arreglo.length-1)));

    }

    public static int Suma(int arreglo[], int n) {

        if (n == 1) {
            return arreglo[0];
        }

        return arreglo[n - 1] + Suma(arreglo, --n);

    }

    //este metodo realiza la suma de una matriz en n/2 de pasos
    public static int SumaMedios(int arreglo[], int low, int high) {

        if ((low + 1) == (high)) {
            return arreglo[low] + arreglo[high];
        } else if (low == high) {
            return arreglo[low];
        }

        return arreglo[low] + arreglo[high] + SumaMedios(arreglo, ++low, --high);

    }

}
