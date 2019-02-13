
package ex03;

import java.util.Scanner;

public class Ex03 {
/*Crie um projeto em Java que:

a) Solicite o nome do produto
   > Caso o usuário informe "mamão" exibir "Produto não permitido!" e não faça mais nada.

b) Solicite o valor de compra de um produto
   > Caso o usuário informe 0 ou negativo, exibir "Sê é loko? Não existe preço 0 ou negativo!" e não faça mais nada.

c) Solicite a porcentagem de lucro desejada na venda. 
   > Se o usuário informar qualquer valor fora do intervalo entre 0 e 200, exibir "Porcentagem de lucro inválida! Digite de 0 a 200" e não faça mais nada

d) Exiba "O produto X foi comprado por R$Y e será vendido por R$Z".

OBS: os operadores && e || funcionam 100% como em JavaScript

Exemplos de valores: 
 Compra: 100, lucro 20, venda: 120
 Compra: 1000, lucro 100, venda: 2000*/
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor1 = new Scanner(System.in);
        
        System.out.println("Qual o nome do produto ?");
        String produto = leitor.next();
        if (produto.equalsIgnoreCase("Mamao")){
            System.out.println("Produto não permitido!");
        }else{
        System.out.println("Qual o valor de compra do produto");
        double valorC = leitor1.nextDouble();
        if (valorC <= 0){
            System.out.println("Sê é loko? Não existe preço 0 ou negativo!");
        }else{
        System.out.println("Qual o valor de lucro desejado (%)");
        double porcDesejada = leitor1.nextDouble();
        if(porcDesejada < 0 || porcDesejada > 200){
            System.out.println("Porcentagem de lucro inválida! Digite de 0 a 200");
            
            
        }else {
            double valorF = valorC *(1+ porcDesejada /100);
            System.out.println("O produto "+produto+" foi comprado por R$ "+valorC+" e será vendido por R$ "+valorF);
        }
        }
        }
    
}
    
}