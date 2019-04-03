
package projetobancogetset;

public class ContaCorrente {
    private String nomeTitular;
    private double saldo;
    private boolean bloqueada;

  

    public ContaCorrente(String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public ContaCorrente(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    
    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "nomeTitular=" + nomeTitular + ", saldo=" + saldo + ", bloqueada=" + bloqueada + '}';
    }
    
        

   
    
}

