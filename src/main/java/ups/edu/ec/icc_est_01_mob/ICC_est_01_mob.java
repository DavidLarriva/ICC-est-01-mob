
package ups.edu.ec.icc_est_01_mob;

/**
 *
 * @author dalar
 */
public class ICC_est_01_mob {

    public static void main(String[] args) {
        
        int[] vector = {6,8,10,12,3,1};
        
        Vectores vectorA = new Vectores(vector);
        
        System.out.println("Vector sin ordenar: ");
        vectorA.imprimirVector();
        
        vectorA.ordenamientoBurbuja();
        
        System.out.println("Vector ordenado: ");
        vectorA.imprimirVector();
        
    }
    
    
}
