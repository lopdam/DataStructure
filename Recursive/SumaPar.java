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
