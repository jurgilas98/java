
package bolsafamilia;

import javax.swing.JOptionPane;

public class BolsaFamilia {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o nome do responsavel pela familia ?");
        String cidade = JOptionPane.showInputDialog("Qual a cidade onde a familia mora ?");
        double qtdFilhos = Double.valueOf (JOptionPane.showInputDialog("Quantos filhos menores de 18 anos ?"))*12.5;
        double qtdPne = Double.valueOf (JOptionPane.showInputDialog("Quantos filhos PNE?"))*14;
        double qtdIdoso = Double.valueOf (JOptionPane.showInputDialog("Quantos de pessoas maiores de 60 anos?"))*10;
        double soma = qtdFilhos + qtdIdoso + qtdPne;
        System.out.println("A família do responsável A vai receber um total de R$"+soma+" por mês\n" +
                           "\n- Valor pelos menores de 18 anos: "+qtdFilhos+
                           "\n- Valor pelos PNE: "+qtdPne+
                           "\n- Valor pelos idosos: " +qtdIdoso+
                           "\nCidade: "+cidade);
         JOptionPane.showMessageDialog(null, "A família do responsável A vai receber um total de R$"+soma+" por mês\n" +
                           "\n- Valor pelos menores de 18 anos: "+qtdFilhos+
                           "\n- Valor pelos PNE: "+qtdPne+
                           "\n- Valor pelos idosos: " +qtdIdoso+
                           "\nCidade: "+cidade);
    }
    
}