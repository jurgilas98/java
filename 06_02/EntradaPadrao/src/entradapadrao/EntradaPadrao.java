
package entradapadrao;

import java.util.Scanner;

public class EntradaPadrao {

    public static void main(String[] args) {
        // Para receber dados do console,
        // Usamos a Scanner do Java
        
        Scanner leitor = new Scanner(System.in);
        // ao criar o leitor podemos usarlo varias vezes 
        
        // lendo texto 
        
        System.out.println("Qual sua cidade ?");
        String cidade = leitor.nextLine();
        
        System.out.println("Quantos habitantes ela tem  ?");
        int habitantes = leitor.nextInt();
         
        System.out.println("Qual a temperatura lá agora  ?");
        double temperatura = leitor.nextDouble();
        
        System.out.println(cidade);
        System.out.println(habitantes);
        System.out.println(temperatura);
        System.out.println("Em "+cidade+" moram "+habitantes+" pessoas e faz " +temperatura+ " agora" );
        
    }
    
}
