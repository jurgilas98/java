
package ex04;

import java.util.Scanner;

public class Ex04 {

/*Crie um projeto em Java que:
a) Solicite o valor da conta do restaurante
b) Pergunte "Você vai pagar os 10%? S para Sim ou Qualquer coisa p/ Não"
c) Calcular o valor total da conta. Caso o usuário tenha informado 1 na pergunta anterior, o valor é a conta + 10%
d) Exibir "Total a pagar R$X"*/
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Qual o valor da conta do restaurante");
        double conta = leitor.nextDouble();
        System.out.println("Você vai pagar os 10%? S para Sim ou Qualquer coisa p/ Não");
        String gorjeta = leitor1.next();
        if (gorjeta.contains("s")){
            double total = conta * 1.1;
            System.out.println("Total a pagar R$ "+total);
        }else{
            System.out.println("Total a pagar R$ " +conta);
        }
    }
    
}
