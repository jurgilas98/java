
package poo01;

public class Lutador {
    String nome;
    int vida = 20 ;
    
    public void definirNome (String apelido){
        nome = apelido;   
        
       
        
    }
    public void apanhar (int forca){
        if ((vida - forca )<0){
            System.out.println(" lutador "+nome+"morreu");
        }else
            vida -= forca;
        for (int i = 0; i!= vida ; i++) {
            System.out.print("|");
            i++;
        }
    }
        
    
}
