
package poo01;

public class ProgramaCalculadora {
    public static void main(String[] args) {
        
        CalculadoraSimples calculo = new CalculadoraSimples();
        CalculadoraSimples calculo1 = new CalculadoraSimples();
        
        calculo.somar(2,2);
        System.out.println(calculo.c);
        calculo.somar(5,2);
        System.out.println(calculo.c);
        calculo.somar(4,7);
        System.out.println(calculo.c);
        calculo.somar(9,7);
        System.out.println(calculo.c);
        calculo1.somar(1,6);
        System.out.println(calculo1.c);
        System.out.println("Quantidade de somas realizadas: "+calculo.calculosRealizados);
        System.out.println("Quantidade de somas realizadas 1: "+calculo1.calculosRealizados);
        
    }
}
