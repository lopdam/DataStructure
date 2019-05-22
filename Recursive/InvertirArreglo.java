//lopdam

/*Programe un método recursivo que invierta los números de un arreglo de enteros.
El método recibe un arreglo y procede a invertir los elementos de este arreglo.
La función debe ser inplace.*/

public class InvertirArreglo{


  public static void main(String[] args) {

    int arreglo[] = {1, 2, 3, 4};

    System.out.println(Invertir(arreglo,0, arreglo.length-1).toString());

  }

  public static int[] Invertir(int arreglo[], int low, int high) {

      int num1=arreglo[low];
      int num2=arreglo[high];

      if ((low + 1) == (high)) {
        arreglo[low]=num1;
        arreglo[high]=num2;
        return arreglo;
        //  return arreglo[low] + arreglo[high];
      } else if (low == high) {
          arreglo[low]==num1;
          return arreglo;
          //return arreglo[low];
      }

      arreglo[low]=num1;
      arreglo[high]=num2;

      return Invertir(arreglo, ++low, --high);

  }
}
