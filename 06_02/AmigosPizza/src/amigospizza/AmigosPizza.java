
package amigospizza;

import java.util.Scanner;


public class AmigosPizza {


    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
       
        
        System.out.println("Quantos amigos vão rachar a pizza?");
        int qtdAmigos = leitor.nextInt();       
        
         System.out.println("Qual o sabor da pizza?");
        String sabor = new Scanner (System.in).nextLine() ;     
        
        
        System.out.println("Qual o valor da pizza?");
        double vlrPizza = leitor.nextDouble();
        
        double total =  (vlrPizza /(double)qtdAmigos);
        
        System.out.println("A pizza de "+sabor+" custa "+vlrPizza+" e cada amigo vai pagar R$ "+total);
        
        
        
        
        
    }
    
}
