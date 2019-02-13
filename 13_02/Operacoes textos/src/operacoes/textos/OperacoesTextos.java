
package operacoes.textos;

public class OperacoesTextos {

    public static void main(String[] args) {
        
        // passar para CAIXA ALTA
        // metodo .toUpperCase()
        System.out.println("açúcar".toUpperCase());
        
        // passar para caixa baixa 
        //metodo .toLowerCase()
        System.out.println("ABacaTe".toLowerCase());
        
        String pais = "Finlândia";
        pais.toUpperCase(); // (JEITO ERRADO POIS NÃO ALTERA A STRING)
        // pais = pais.toUpperCase(); // (JEITO MAIS OU MENOS Q ESTRAGA O DADO NA VARIAVEL)
        String paisUpper = pais.toUpperCase();
        System.out.println(pais);
        System.out.println(pais.toUpperCase());
        System.out.println(paisUpper);
        
        // Saber se um conteúdo está presente
        String frase = "Só o amor constrói e o fiado destrói";
        
        // Descobrindo a posição (a partir de 0)
        System.out.println(frase.indexOf("amor"));
        System.out.println(frase.indexOf("fiado"));
        System.out.println(frase.indexOf("Mundial do Palmeiras"));
        
        // saber se um texto está presente
        System.out.println(frase.contains("amor"));
        System.out.println(frase.contains("Palmeiras tem Mundial"));
        
        // obter uma parte do texto 
        // o primeiro argumento é INCLUSIVO (conta com ele)
        // o segundo, é EXCLUSIVO (não conta com ele) 
        
        System.out.println(frase.substring(0,9)); // (0 a 8)
        System.out.println(frase.substring(10,19)); //  (10 a 18)
        
        // contando a quantidade de letras 
        
        System.out.println(frase.length());
        System.out.println("milk shake".length());
        System.out.println("".length());
         
        // trocando caracteres 
        
        String troca1 = "abacaxi" .replace("a", "@");
        System.out.println(troca1);
        
        System.out.println("viva a vida".replace("vida", "noite"));
        
}
}