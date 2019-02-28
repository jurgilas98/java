package repeticoes.pkgwhile;

import java.util.Scanner;

public class RepeticoesWhile {

    public static void main(String[] args) {

        // O while no Java é exatamente como em JS
        
        // ex: exiba uma frase 10x na tela
        
        int contador = 0;
        
        // o while pode ser totalmente ignorado
        // ou seja, pode não executar seu bloco NENHUMA vez
        while (contador++ < 10) {
            System.out.println("Só o amor constrói");
        }
        
        
        // ex: solicite ao usuário sua idade. 
        // Insista caso ele informe menor que 0.
        Scanner leitor = new Scanner(System.in);
        int idade = -1;
        
        while (idade < 0) {
            System.out.println("Sua idade?");
            idade = leitor.nextInt();
        }
    }
    
}
