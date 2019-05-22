# Data Structure


## Recursividad

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
#### Decimal a Binario

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
#### Invertir arreglo
```java
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

```
#### Multiplicacion de Digitos
```java
//lopdam

/*Escriba un programa recursivo que reciba un número entero positivo
y retorne como resultado la multiplicación de los dígitos de este número.
*/

public class MultiplicacionDigitos{

  public static void main(String[] args) {

    int n=223;
    int result=Multiplicar(n);
    System.out.println(String.valueOf(result));
  }

  public static int Multiplicar(int n){

   if(n<10){
     return n;
   }
    return (n%10)*Multiplicar(n/10);
  }
}

```
#### Multiplicacion Numero

```java
//lopdam
/*Escribir una función recursiva que devuelva la multiplicación de los primeros N enteros.
El usuario solo proporcionará un número y usted debe retornar la multiplicación
 de todos los números enteros desde el 1 hasta el número que ingresó el usuario (incluyéndolo).*/

public class MultiplicacionNumber{

  public static void main(String[] args) {
    int n=3;
    int result=Multiplicacion(n);
    System.out.println(String.valueOf(result));
  }

  //La funcio es recursiva
  //Devuelve la Multiplicacion de los n primero numeros, de un numero dado

  public static int Multiplicacion(int n){
    if(n==1){
      return 1;
    }
  return n*Multiplicacion(--n);

  }



}
```
#### Multiplicacion Arreglo
```java
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
#### Suma de 2 hasta n par
```java
//lopdam
/*Escribir un programa recursivo que encuentre la suma de los enteros positivos pares desde N hasta 2.
El usuario proporcionará un número par y usted deberá retornar la suma de los enteros positivos pares.*/

public class SumaPar{

  public static void main(String[] args) {
    int n=6;
    int result=Suma(n);

    System.out.println(String.valueOf(result));
  }

  //Sumar los m numero pares desde 2 hasta n
  public static int Suma(int n){


    n=(n%2==0)?n:--n;
    if(n<=2){
      return 2;
    }
    return n+Suma(n-2);
  }
}
```
