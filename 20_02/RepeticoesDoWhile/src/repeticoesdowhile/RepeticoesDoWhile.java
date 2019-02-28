package repeticoesdowhile;

import java.util.Scanner;

public class RepeticoesDoWhile {

    public static void main(String[] args) {
        // do-while executa PELO MENOS 1 vez
        
        // ex: solicite o peso do usuário. Não aceite < 20
        
        Scanner leitor = new Scanner(System.in);
        double peso;
        
        do {
            System.out.println("Qual seu peso");
            peso = leitor.nextDouble();
        } while (peso<20);
    }
    
}



