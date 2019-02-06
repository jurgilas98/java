
package numeros;

public class Numeros {

    public static void main(String[] args) {
        // Números inteiros -> int
        int idade = 20;
        
        int temperatura = - 13 ;
                
        // Números inteiros longos -> long
        long bacterias = 78432895632984756L;
        
        // Números reais -> double 
        double altura = 1.90 ;
        
        // Números reais pequenos -> float
        float peso = 75F;//ou f
        float imc = 19.5f;//ou F
        
        
        // Operações metemáticas básicas
        System.out.println("Adição "+(peso + altura));        
        System.out.println("Subtração "+(peso - altura));        
        System.out.println("Multiplicação "+(peso * altura));        
        System.out.println("Divisão "+(peso / altura));

        // potencia -> Math.pow()
        
        double doisAoCubo = Math.pow(2,3);
        double tresAQuarta = Math.pow(3,4);
        System.out.println(doisAoCubo);
        System.out.println(tresAQuarta);
        
        // raiz quadrada -> Math.sqrt()
        
        double raiz144 = Math.sqrt(144);
        System.out.println(raiz144);
        
        // Max Min entre 2 números 
        
        double maior = Math.max(10, 80);// Será 80
        double menor = Math.min(10, 80);// Será 10
        
        System.out.println(maior);
        System.out.println(menor);

        
    }
    
}
