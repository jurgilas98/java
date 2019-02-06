
package ex02.pkg6.pkg02;

import java.util.Scanner;
/*Crie um projeto Java chamado Sayajins.
a) Pergunte ao usuário a força (ki) base de um guerreiro Sayajin.
b) Pergunte o nome do guerreiro Sayajin.
c) Exiba na tela seus niveis de força de acordo com as transformações que um Sayajin pode sofrer:

Níveis de poder do Sayajin NOME:
Ki na forma base: A
Ki em Super Sayajin: B
Ki em Super Sayajin 2: C
Ki em Super Sayajin 3: D
Ki em Deus Super Sayajin: E
Ki em Super Sayajin Blue: F

Nota: Onde A é o ki informada em a). B é Ax50. C é Ax100. D é Ax500. E é Ax1000. F é Ax50000.
*/
public class Ex02602 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
    System.out.println("Qual a força (ki) base de um guerreiro Sayajin? ");
        double kiBase = leitor.nextInt();
        
    System.out.println("Qual o nome do guerreiro Sayajin ");
        String nome = new Scanner (System.in).nextLine();
        
        System.out.println(
"Níveis de poder do Sayajin "+nome+":\nKi na forma base: " +kiBase+
"\nKi em Super Sayajin: " +kiBase*50+
"\nKi em Super Sayajin 2: " +kiBase*100+
"\nKi em Super Sayajin 3: " +kiBase*500+
"\nKi em Deus Super Sayajin: " +kiBase*1000+
"\nKi em Super Sayajin Blue: "+kiBase*50000);
    }
    
}
