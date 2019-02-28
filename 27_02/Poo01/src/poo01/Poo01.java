package poo01;

public class Poo01 {

    public static void main(String[] args) {
        //aqui estamos criando, ou seja INSTANCIANDO
        //um Carro. Seu nome é carrinho1
        //ou seja, criamos um OBJETO do tipo de Carro
        Carro carrinho1 = new Carro ();
        
        System.out.println("carrinho1 ligado? "+carrinho1.ligado);
        
        // aqui nos INVOCAMOS o método "ligar()"
        carrinho1.ligar();
        
        System.out.println("carrinho1 ligado? "+carrinho1.ligado);
        
        Carro carroLoko = new Carro();
        
        System.out.println("carroLoko ligado? "+carroLoko.ligado);
        
        System.out.println("Km do carroLoko: "+carroLoko.km);
        System.out.println("Km do carrinho1: "+carroLoko.km);
        
        carrinho1.acelerar();
        
        System.out.println("Km do carroLoko: "+carroLoko.km);
        System.out.println("Km do carrinho1: "+carrinho1.km);
        
        carroLoko.acelerar();
        
        System.out.println("Km do carroLoko: "+carroLoko.km);
        System.out.println("Km do carrinho1: "+carrinho1.km);
        
        System.out.println("carrinho1: "+carrinho1);
        
        System.out.println("carroLoko: "+carroLoko);
    }
    
}
