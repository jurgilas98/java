
package entradasaidajanela;

import javax.swing.JOptionPane;


public class EntradaSaidaJanela {

    
    public static void main(String[] args) {
        // Exibir uma janela 
        JOptionPane.showMessageDialog(null, "Frase Loka");
        //Lendo informações de uma janela
        //Importante : Tudo que é lido na janela é String !
        String fruta = JOptionPane.showInputDialog("Qual a fruta ?");
        
        JOptionPane.showMessageDialog(null,"A fruta é "+fruta);
        
        int idade = Integer.valueOf(JOptionPane.showInputDialog("Informe sua idade"));
        
       // OU int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
        
        double nota = Double.parseDouble (JOptionPane.showInputDialog("Sua nota"));
     
        //Curiosidade 
        // os métodos parseInt e parseDouble
        // podem ser substituidos por valueOf
        
    }
    
}