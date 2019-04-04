
package futebolpontoscorridos;

public class FutebolPontosCorridos {

    public static void main(String[] args) {
        TimeFutebol time1 = new TimeFutebol("Palmeiras");
        TimeFutebol time2 = new TimeFutebol("Santos");
        time1.registrarVitoria();
        time1.registrarEmpate();
        time2.registrarVitoria();
        time2.registrarVitoria();
        time2.registrarVitoria();
        time2.registrarDerrota();
        System.out.println(time1);
        System.out.println(time2);
        time1.registrarDerrota();
        time1.registrarDerrota();
        System.out.println(time1);
        
        

    }
    
}
