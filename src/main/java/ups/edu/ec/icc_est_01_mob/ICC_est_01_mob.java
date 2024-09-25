
package ups.edu.ec.icc_est_01_mob;

/**
 *
 * @author dalar
 */
public class ICC_est_01_mob {

    public static void main(String[] args) {
        
        int[] vectorA = {6,8,10,12,3,1};
        
        Vectores vector = new Vectores(vectorA);
        
        System.out.println("Vector sin ordenar: ");
        vector.imprimirVector();
        
        vector.ordenamientoBurbuja();
        vector.ordenamientoBurbujaM();
        
        System.out.println("Vector ordenado: ");
        vector.imprimirVector();
        
        
        //Ordenar las palabras Alfabeticamente de la cadena de texto
        
        String cadena = "este es un ejemplo de texto para Ordenar";
        
        Palabras palabra = new Palabras();
        
        String cadenaOrdenada;
        
       
        cadenaOrdenada = palabra.sortByBubblePalabras(cadena.split(" "));
        
        System.out.println(palabra);
        
    }
    
    
}
