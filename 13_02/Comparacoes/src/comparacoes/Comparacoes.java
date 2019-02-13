
package comparacoes;

import java.util.Scanner;

public class Comparacoes {

    public static void main(String[] args) {
        //comparando igualdade
        System.out.println(10==10);
        
        //verificando se é diferente 
        System.out.println(7 != 3);
        
        //comparando textos (String)
        System.out.println("Digite uma palavra");
        String palavra = new Scanner(System.in).next();
        System.out.println("amor" == palavra);
        //a comparação acima não é o que parece 
        //ela NÃO compara valor 
        //para comparar texto ou qualquer objeto
        // usamos .equals()
        System.out.println(palavra.equals("amor"));
        System.out.println("amor".equals(palavra));
        
        //comparando textos independente de CAIXA ALTA ou baixa 
        //ou seja, "case insensitive"
        // usamos .equalsIgnoreCase()
        System.out.println(palavra.equalsIgnoreCase("amor"));
        System.out.println("amor".equalsIgnoreCase(palavra));
        
    }
    
}
