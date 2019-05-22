# Data Structure
## Estructura de Datos Usando Java.


### Recursividad

#### Busqueda Binaria

```java
public class BusquedaBinaria {

    public static void main(String[] args) {

      //El vector ingresadao debe estar ordenado
        int[] vector = {1, 4, 7, 8, 9, 14, 23, 47, 56, 60, 61, 63, 65, 66, 68, 69, 70, 73, 76, 77, 79, 80, 82};
        int valorBuscado = 70;
        boolean encontrar = binarySearch(vector, valorBuscado, 0, (vector.length-1));
        //la funcio devuelve verdadero si se encuentra el elmento

        System.out.println(String.valueOf(encontrar));
    }

    public static boolean binarySearch(int[] data, int target, int low, int high) {

        if (low > high) {

            return false;
        } else {

            int mid = (low + high) / 2;

            if (target == data[mid]) {

                return true;

            } else if (target < data[mid]) {

                return binarySearch(data, target, low, mid - 1);

            } else {

                return binarySearch(data, target, mid + 1, high);
            }
        }

    }



}
```
#### Busqueda Binaria

```java
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

```

#### Suma de Arreglo
```java
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

        System.out.println(String.valueOf(Suma(arreglo, arreglo.length-1)));

    }

    public static int Suma(int arreglo[], int n) {

        if (n == 1) {
            return arreglo[0];
        }

        return arreglo[n] + Suma(arreglo, --n);

    }
  }
```
#### Suma de Arreglo en n/2 de pasos
```java
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
```
