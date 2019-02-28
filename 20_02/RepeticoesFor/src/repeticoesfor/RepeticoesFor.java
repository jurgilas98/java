package repeticoesfor;

public class RepeticoesFor {

    public static void main(String[] args) {
        
        // for é mais usado quando a repetição é
        // orientada a uma quantidade de repetições
        
        // ex: exiba uma frase 8x
        
        /*
            1ª parte: criação da variável de controle
            2ª parte: condição de repetição
            3ª parte: como a variável de controle se altera
            TODAS elas são OPCIONAIS
        */
        for (int f=0; f<8; f++) {
            System.out.println("é nóis, mano");
        }
        
        // ex: sem a 1ª parte
        int f=0;
        for (; f<8; f++) {
            System.out.println("é nóis, mano");
        }
        
        // ex: sem 1ª nem a 3ª parte
        int g=0;
        for (; g<8;) {
            System.out.print("é nóis, mano");
            g++;
        }
        
        // ex: sem nenhuma parte
        int x=0;
        for (;;) { // nesse caso, a princípio, é um loop infinito
            System.out.print(" é nóis, mano ");
            if (g++>=8) {
                break; // sai do for imediatamente
            }
        }
    }
    
}
