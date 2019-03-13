
package trabalhadorhomeoffice.leandro.jurgilas;

public class TrabalhadorHomeOfficeLeandroJurgilas {

    public static void main(String[] args) {
        Trabalhador T1 = new Trabalhador();        
        Trabalhador T2 = new Trabalhador();
        T1.definirNome("Pedro");
        T2.definirNome("Ana");        
        T1.definirValorHora(5);   
        T2.definirValorHora(30);
        T1.registrarHorasTrabalhadas(10);   
        T1.registrarHorasTrabalhadas(0);    
        T1.registrarHorasTrabalhadas(5);   
        T1.registrarHorasTrabalhadas(6);
        T2.registrarHorasTrabalhadas(30);
        T1.exibirValorAReceber();   
        T2.exibirValorAReceber();
        T2.inicarNovoMes();
        T2.exibirValorAReceber();
        

    
        
    }
    }
    
