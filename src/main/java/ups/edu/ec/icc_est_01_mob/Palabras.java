
package ups.edu.ec.icc_est_01_mob;

/**
 *
 * @author dalar
 */
public class Palabras {
    
    public String [] sortByBubblePalabras(String[] palabras){

        int tamanio = palabras.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i+1; j < tamanio ; j++) {
                if (palabras[i].compareToIgnoreCase(palabras[j])>0) {
                    String aux = palabras[i];
                    palabras [i] = palabras[j];
                    palabras [j] = aux;
                    
                }
                
            }
            
        }
        return palabras;
    }
    
}
