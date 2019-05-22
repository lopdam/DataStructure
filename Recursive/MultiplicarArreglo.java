//lopdam

/*Programar un algoritmo recursivo que
permita multiplicar los elementos de un arreglo.*/

public class MultiplicarArreglo{

  public static void main(String[] args) {
    int arreglo[] = {1, 2, 3, 4};

    System.out.println(String.valueOf(Multiplicar(arreglo,0, arreglo.length-1)));
  }

  public static int Multiplicar(int arreglo[], int low, int high) {

      if ((low + 1) == (high)) {
          return arreglo[low]*arreglo[high];
      } else if (low == high) {
          return arreglo[low];
      }

      return arreglo[low]*arreglo[high]*Multiplicar(arreglo, ++low, --high);

  }
}
