
package projetobanco;

public class ContaCorrente {
    private String nomeTitular ;
    private String agencia ;
    private String digitoAgencia ;
    private String numeroConta ;
    private String digitoConta ;
    private double saldo ;
    private double limiteChequeEspecial ;

    public ContaCorrente(String nomeTitular, String agencia, String digitoAgencia, String numeroConta, String digitoConta, double limiteChequeEspecial) {
        atualizarNomeTitular(nomeTitular);
        this.agencia = agencia;
        this.digitoAgencia = digitoAgencia;
        this.numeroConta = numeroConta;
        this.digitoConta = digitoConta;
        this.limiteChequeEspecial = limiteChequeEspecial ;
    }
    
    public void depositar(double valorDeposito){
        if(valorDeposito > 0){
        this.saldo += valorDeposito; //boa pratica utilizar this.
        }else {
            System.out.println("Operação impossivel");
        }
    }
    
    public void sacar (double valorSaque){
        if (valorSaque > 0 && this.saldo + this.limiteChequeEspecial >= valorSaque ){
            this.saldo -= valorSaque;
    }else{
            System.out.println("Operação impossivel");
        }
 
}
    
    public void definirChequeEspecial(double novoLimite){
        if (novoLimite >= 0) {
    this.limiteChequeEspecial = novoLimite ;
        
}
    }  
    public void atualizarNomeTitular(String novoNome){
    if (novoNome.length()>=5 && novoNome != null){
    this.nomeTitular = novoNome ;
}
    
    
}

    @Override
    public String toString() {
        return "ContaCorrente{" + "nomeTitular=" + nomeTitular + ", agencia=" + agencia + ", digitoAgencia=" + digitoAgencia + ", numeroConta=" + numeroConta + ", digitoConta=" + digitoConta + ", saldo=" + saldo + ", limiteChequeEspecial=" + limiteChequeEspecial + '}';
    }}
