
package ups.edu.ec.icc_est_01_mob;

/**
 *
 * @author dalar
 */
public class Vectores {
    
    private int[] vector;
    
    public Vectores(int[] vector) {
        this.vector = vector;
        System.out.println("Se creo la clase Vectores");
    }
    
    public void ordenamientoBurbuja() {
        int n = vector.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    
    
    public void imprimirVector() {
         for (int num : vector) { //Este for es forich y se va a iterar desde el inicio del array hasta el final, guardandose en una variable.
            System.out.print(num + " "); //En este caso num
        }
        System.out.println();
    }
}
        
    

