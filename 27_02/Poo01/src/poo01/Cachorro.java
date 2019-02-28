
package poo01;

public class Cachorro {
    String apelido;
    double peso;
    
    
    public void comer (String comida , double quantidade){
        if (quantidade < 0){
            System.out.println("Alimentação inválida");
        }else if (peso > 30){
            System.out.println("Cão obeso demais, não vai aceitar comida");
        }else {
            
            
            peso += quantidade * 0.3;
            System.out.println ( String.format("Cão comeu %.2f",quantidade)+" de "+comida);
            System.out.println ( String.format("Cão pesa %.2f",peso));
        }
    }
    public void definirApelido (String nome){
        apelido = nome;
        
    }

    @Override
    public String toString() {
        return "Cachorro{" + "apelido = " + apelido+ String.format( ", peso = %.2f", peso);
    }
}
    