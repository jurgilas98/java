
package boletimmitico;

public class BoletimMitico {

    public static void main(String[] args) {
        BoletimEscolar boletim1 = new BoletimEscolar("Lucas" , "Historia");
        BoletimEscolar boletim2 = new BoletimEscolar("João" , "Geografia");
        boletim1.setNumeroAulas(10);
        boletim1.registrarFalta();
        boletim1.registrarFalta();
        System.out.println(boletim1);
        boletim1.registrarFalta();
        boletim1.registrarFalta();
        boletim1.registrarFalta();
        System.out.println(boletim1);
        boletim2.setNumeroAulas(50);
        boletim2.registrarFalta();
        boletim2.registrarFalta();
        System.out.println(boletim2);
        boletim2.registrarFalta();
        boletim2.registrarFalta();
        boletim2.registrarFalta();
        System.out.println(boletim2);

    }
    
}
