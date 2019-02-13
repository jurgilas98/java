
package ex02.pkg1;

import java.util.Scanner;

public class Ex021 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        Scanner leitor1 = new Scanner (System.in);

        System.out.println("Qual o seu nome ?");
        String nome = leitor.next();
        System.out.println("Qual a sua idade ?");
        int idade = leitor1.nextInt();
        
        if (idade < 18){
            System.out.println(nome+", vai jogar playstation!");
        } else {
            System.out.println("Bem vindo ao Bahamas, "+nome);
            
        }
         
    }
    
}
