
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
