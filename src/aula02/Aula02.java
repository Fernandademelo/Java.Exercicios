
package aula02;

/**
 *
 * @author ferna
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Cristal";
        c2.cor = "Preta";
        c2.ponta = 1.0f;
        c2.destampar(); 
        c2.status();
        c2.rabiscar();
        
        
             
    }
    
}
