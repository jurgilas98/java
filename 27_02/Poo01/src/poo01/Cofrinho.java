
package poo01;
// Cofrinho raiz
public class Cofrinho {
    
    double valor ;
    boolean quebrado ;

    @Override
    public String toString() {
        return "Cofrinho{" + "valor=" + valor + ", quebrado=" + quebrado + '}';
    }
    public void quebrar(){
        quebrado = true;
        valor = 0;
        }

    //Método depositar () PRECISA de uma informação para funcionar, ou seja de um ARGUMENTO seu argumento é um double, chamado "depósito"
    public void depositar (double deposito){
        if (quebrado || deposito < 0){
            System.out.println("Cofrinho quebrado ou deposito inválido");
            
        }else {
            valor += deposito;
        }
    }
    
    
}
