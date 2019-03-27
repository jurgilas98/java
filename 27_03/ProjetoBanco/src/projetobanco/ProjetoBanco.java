
package projetobanco;

public class ProjetoBanco {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Zé Ruela", "0101", "9", "777", "5",0);
        ContaCorrente conta2 = new ContaCorrente("Lady Gaga", "0202", "9", "777", "5",0);
           
        System.out.println(conta1);
        System.out.println(conta2);
        
        conta2.depositar(5000);
        conta2.depositar(300);
        conta2.depositar(-300);
        System.out.println(conta2);
        conta2.sacar(200);
        conta2.sacar(100);
        System.out.println(conta2);
        conta2.sacar(-3000);
        conta2.sacar(80000);
        System.out.println(conta2);
        conta2.definirChequeEspecial(1000);
        conta2.sacar(6000);
        System.out.println(conta2);
        conta2.atualizarNomeTitular("Just"); 
        System.out.println(conta2);
        conta2.atualizarNomeTitular("Justin Bieber");

        System.out.println(conta2);
        
        
        
    }
    
}
