
package ex02.pkg2;

import java.util.Scanner;

public class Ex022 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor1 = new Scanner(System.in);
        
        System.out.println("Qual o valor da pizza?");
        double valor = leitor1.nextDouble();
        System.out.println("Qual o sabor da pizza?");
        String nome = leitor.next();
        System.out.println("Quantas pessoas vão entrar no racha ?");
        double pessoas = leitor1.nextDouble();
        System.out.println("Qual o valor máximo por pessoa no racha?");
        double valorMax = leitor1.nextDouble();
        double valorDiv = valor/pessoas;
        double max = valorMax * pessoas;
        System.out.println("Valor maximo por pessoa - "+valorMax);
        System.out.println("Valor da pizza - "+valor);
        System.out.println("valor maximo da pizza - "+ max);
        System.out.println("numero de pessoas - "+pessoas);
        
        
        if (max >= valor){
            System.out.println("A pizza de "+nome+" será dividida entre "+pessoas+" pessoas. R$ "+valorDiv+" p/ cada");
        }else {
            System.out.println("Deu ruim no racha. A pizza deveria custar no máximo "+max);
        }
        

    }
    
}
