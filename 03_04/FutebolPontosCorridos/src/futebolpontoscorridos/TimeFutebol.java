
package futebolpontoscorridos;

public class TimeFutebol {
    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;

    public TimeFutebol(String nome) {
        this.nome = nome;
    }

    public String setNome() {
        return nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    
    public void registrarVitoria(){
        vitorias++;
    }
    public void registrarEmpate(){
        empates++;
    }
    public void registrarDerrota(){
        derrotas++;
    }
    public String getPontuação(){
        return(" Vitória: "+vitorias+" pontos; Empate: "+empates+" pontos; Derrota: "+derrotas+" pontos");
        
    }
    public boolean isInvicto(){
        return derrotas <= 0;
    }

    @Override
    public String toString() {
        return "TimeFutebol{" + "nome=" + nome + ", vitorias=" + vitorias + ", derrotas=" + derrotas + ", empates=" + empates + ", Pontuação=  "+getPontuação()+ ", Invicto= "+isInvicto()+'}';
    }


    }

    
    

