
package serializacion2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author julian
 */
public class Serializacion2 {

    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String[] cod = {"p1", "p2", "p3"};
        String[] desc = {"parafusos", "cravos ", "tachas"};
        int[] prezo = {3, 4, 5};
        
        Product p1 = new Product(cod[0], desc[0], prezo[0]);
        Product p2 = new Product(cod[1], desc[1], prezo[1]);
        Product p3 = new Product(cod[2], desc[2], prezo[2]);
        
        FileOutputStream fo = new FileOutputStream("/home/oracle/Documents/serial2.txt");
        ObjectOutputStream salida = new ObjectOutputStream(fo);
        salida.writeObject(p1);
            
        salida.writeObject(p2);
        salida.writeObject(p3);
        //se pone para saber donde acaba el fichero
        salida.writeObject(null);
        
        
        salida.close();
        
        
        FileInputStream fi = new FileInputStream("/home/oracle/Documents/serial2.txt");
        ObjectInputStream entrada = new ObjectInputStream(fi);
        /**
         * La variable sirve para leer la primera
         */
        Object aux=entrada.readObject();
        while(aux!=null){
            System.out.println(aux);
            aux=entrada.readObject();
            
        }
        
        entrada.close();
    }
    
}
