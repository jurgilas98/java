
package br.com.bandtec.projetoarquivos;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Programa {

    public static void main(String[] args) throws IOException {
        
       String palavra = "olá";
        File file = new File("texto.txt");
       FileUtils.writeStringToFile(file, palavra);
       
    }
   
}
