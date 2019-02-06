
package textossimples;

public class TextosSimples {

   
public static void main(String[] args) {

    // textos em java -> String    
    String time = "Ibis Futebol Clube";
    String bairro = "São Matheus";    
    //Concatenando Strings     
    String frase1 = "O time "+time+" fica em "+bairro;     
    System.out.println(frase1);
    //Concatenando com interpolação
    String frase2 = String.format("Time: %s. Bairro: %s.", time, bairro);
    System.out.println(frase2);
    //"Somando" o conteúdo de strings
    String frase3 = "";
    frase3+=frase2;
    System.out.println(frase3);
    }
}