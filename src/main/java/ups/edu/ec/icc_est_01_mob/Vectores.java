
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
    
      public void ordenamientoBurbuja(){

        int tamanio = vector.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i+1; j < tamanio ; j++) {
                if (vector[i] > vector[j]) {
                    int aux = vector[i];
                    vector [i] = vector[j];
                    vector [j] = aux;
                    
                }
                
            }
            
        }
        
    }
      
      
     public void ordenamientoBurbujaM(){

        int tamanio = vector.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i+1; j < tamanio ; j++) {
                if (vector[i] < vector[j]) {
                    int aux = vector[i];
                    vector [i] = vector[j];
                    vector [j] = aux;
                    
                }
                
            }
            
        }
        
    }
     
     
     
     
     
      public void ordenamientoBurbujaPalabras(){

        int tamanio = vector.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i+1; j < tamanio ; j++) {
                if (vector[i] > vector[j]) {
                    int aux = vector[i];
                    vector [i] = vector[j];
                    vector [j] = aux;
                    
                }
                
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
        
    

