
package boletimmitico;

public class BoletimEscolar {
    private String nomeAluno ;
    private String nomeDisciplina;
    private double nota1;
    private double nota2;
    private int numeroAulas;
    private int numeroFaltas;

    public BoletimEscolar(String nomeAluno, String nomeDisciplina) {
        this.nomeAluno = nomeAluno;
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getNumeroAulas() {
        return numeroAulas;
    }

    public void setNumeroAulas(int numeroAulas) {
        this.numeroAulas = numeroAulas;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }
    
    
    void registrarFalta(){
        numeroFaltas ++;
    }
    public double getFrequencia(){
       double frequencia;
       frequencia = (numeroAulas - numeroFaltas)*100  /numeroAulas;
       return frequencia;
    }

    @Override
    public String toString() {
        return "BoletimEscolar{" + "nomeAluno= " + nomeAluno + ", nota1= " + nota1 + ", nota2= " + nota2+ "Frequência= "+getFrequencia()+'}';
    }
    
    
    
}
