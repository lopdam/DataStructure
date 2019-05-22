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
