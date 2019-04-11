
package br.com.bandtec.projetobibliotecas;

import br.com.bandtec.bibliotecaloka.Calculadora;

public class Programa {
    public static void main(String[] args) {
        System.out.println("Boa Tarde, maven!");
        
        Calculadora calc = new Calculadora();
        System.out.println("Soma: "+calc.somar(5, 2));
        System.out.println("Subtrair: "+calc.subtrair(5, 2));
        
    }
}
