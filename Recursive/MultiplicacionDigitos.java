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
