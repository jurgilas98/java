
package poo01;

public class ProgramaCofrinhos {
    public static void main(String[] args) {
        Cofrinho cofre1 = new Cofrinho();
        System.out.println(cofre1);
        
        
        cofre1.depositar(120);
        System.out.println(cofre1);
        
        cofre1.depositar(30);
        System.out.println(cofre1);
        
        cofre1.depositar(-80);
        System.out.println(cofre1);
        
        cofre1.quebrar();
        System.out.println(cofre1);
        
        cofre1.depositar(90);
        System.out.println(cofre1);
    }
}
