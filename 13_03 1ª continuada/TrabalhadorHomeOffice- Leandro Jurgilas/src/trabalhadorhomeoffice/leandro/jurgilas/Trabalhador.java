
package trabalhadorhomeoffice.leandro.jurgilas;

public class Trabalhador {
    String nome ;
    double horasTrabalhadasMes ;
    double valorHora ;
    int contador = 0 ;

public void definirNome (String novoNome){
    nome = novoNome;
    System.out.println("O nome " +novoNome+ " foi registrado com sucesso !");
}

public void definirValorHora (double novoValor){
        valorHora = novoValor ;
        System.out.println("Foi definido o valor de R$ " +novoValor+ " por hora para "+nome+" com sucesso !");
        
    }

public void registrarHorasTrabalhadas(double horas){
        if (horas <= 0){
            System.out.println("Valor da hora ainda não configurado!");
            
        }else{
            horasTrabalhadasMes += horas ;
            contador ++;
            System.out.println("Foram registradas "+ horas+" horas para "+nome+"  com sucesso !");
        }
        
    }
public void inicarNovoMes(){
        horasTrabalhadasMes = 0 ;
        contador = 0;
        
    }

public void exibirValorAReceber(){
        double valorMes = (horasTrabalhadasMes * valorHora);  
        
        System.out.println("Até o momento, você fez " +contador+ " registros de horas e "+nome+" tem R$ " +valorMes+ " para receber");
        
    }

}