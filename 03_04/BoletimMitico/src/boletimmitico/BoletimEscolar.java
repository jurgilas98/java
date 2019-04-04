
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

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public boolean hasFaltas(){
        return numeroFaltas > 0 ;
        
    }
    
    void registrarFalta(){
        numeroFaltas ++;
    }
    public double getFrequencia(){       
       return (double)(numeroAulas - numeroFaltas)*100  /numeroAulas;
    }
    public double getMedia(){
        return (nota1+nota2)/2;
    }
    
    public boolean isAprovado(){
        return (getMedia()>= 5 && getFrequencia() >= 75);    
    }

    @Override
    public String toString() {
        return "Boletim Escolar {" + "nomeAluno= " + nomeAluno + ", nota1= " + nota1 + ", nota2= " + nota2 + ", Media= "+getMedia()+ ", Frequência= " + getFrequencia() + ", Aprovado= " +isAprovado()+", Tem falta= " + hasFaltas()+'}';
    }
    
    
    
}
