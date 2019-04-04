
package boletimmitico;

public class BoletimMitico {

    public static void main(String[] args) {
        BoletimEscolar boletim1 = new BoletimEscolar("Lucas" , "Historia");
        BoletimEscolar boletim2 = new BoletimEscolar("João" , "Geografia");
        boletim1.setNumeroAulas(10);
        System.out.println(boletim1);
        boletim1.registrarFalta();
        boletim1.registrarFalta();
        boletim1.setNota1(7.5);
        System.out.println(boletim1);
        boletim1.registrarFalta();
        boletim1.registrarFalta();
        boletim1.registrarFalta();
        boletim1.setNota2(9.3);
        System.out.println(boletim1);
        boletim2.setNumeroAulas(32);
        boletim2.registrarFalta();
        boletim2.registrarFalta();
        boletim2.setNota1(5.4);
        System.out.println(boletim2);
        boletim2.registrarFalta();
        boletim2.registrarFalta();
        boletim2.registrarFalta();
        boletim2.setNota2(8.2);
        System.out.println(boletim2);

    }
    
}
