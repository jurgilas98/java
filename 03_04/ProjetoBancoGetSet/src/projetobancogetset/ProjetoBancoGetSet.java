package projetobancogetset;

public class ProjetoBancoGetSet {

    public static void main(String[] args) {
        ContaCorrente conta2 = new ContaCorrente("Chaves");
        ContaCorrente conta3 = new ContaCorrente("Lelê");
        ContaCorrente conta4 = new ContaCorrente("Eike Batista" , 90_000);
        ContaCorrente conta5 = new ContaCorrente("Jessica Alba" , 390_000);
        // Construtor padrão criado manualmente 
        Poupanca poupanca = new Poupanca();
        Poupanca poupanca2 = new Poupanca("Ke$ha" , 9000);
        
        System.out.println(conta5.getNomeTitular());
        
        conta5.setNomeTitular("Jessica Ferrari");
        
        System.out.println(conta5.getNomeTitular());
        
    }
    
}
