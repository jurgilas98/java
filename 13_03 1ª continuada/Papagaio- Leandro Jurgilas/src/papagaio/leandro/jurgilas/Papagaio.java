
package papagaio.leandro.jurgilas;

public class Papagaio {
    String nome ;
    int quantidadeRepeticoes;

public void definirNome(String novoNome){
    nome = novoNome; 
    
} 
public void definirRepeticoes(int quantidade){
 if (quantidade <= 0){
     System.out.println("Valor de repetiçoes inválido");
 }else{
     quantidadeRepeticoes = quantidade;
 }

}
public void repetir(String frase){
    if (nome == null){
        System.out.println("Papagaio só repete se tiver um nome");
    
    }else if (quantidadeRepeticoes <= 0){
        System.out.println("O papagaio "+nome+" ainda não foi orientado a repetir");
    }else {
        for (int f=0; f<quantidadeRepeticoes; f++) {
            System.out.println("O papagaio "+nome+" diz: "+frase);
        }
    }
}
}
