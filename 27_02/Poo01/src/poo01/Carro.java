
package poo01;

//classe Carro
public class Carro {
    // Atributos de instãncia 
    String modelo;
    String cor;
    int ano;
    double km;
    boolean ligado;
    // método (ou seja uma ação que o Carro sabe fazer)
    //método "ligar"
    public void ligar () {
       ligado = true;      
    }
    
    public void desligar (){
        ligado = false;
    }
    
    public void acelerar (){
        // Um carro só pode ligar se ele estiver ligado
        if (ligado){
        //supondo que cada vez q acelerado aumenta 15 km
        km += 15;
        } else {
            System.out.println("Carro desligado");
        }
    }
        // toString é a representação textual dos objetos de uma classe
//    @Override
//    public String toString() {
//      return "Modelo: "+modelo+" / Ano: "+ano+" / Km rodados: "+km;
//    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + ", km=" + km + ", ligado=" + ligado + '}';
    }

}