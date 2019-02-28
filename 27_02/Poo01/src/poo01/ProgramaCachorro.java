
package poo01;
public class ProgramaCachorro {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();
        cachorro1.apelido = "rex";
        cachorro2.apelido = "bob";
        cachorro1.peso = 10;
        cachorro2.peso = 27;
        cachorro1.comer("pão",2);
        System.out.println(cachorro1);
        cachorro1.comer("pão",4);
        System.out.println(cachorro1);
        cachorro1.comer("pão",8);
        System.out.println(cachorro1);
        cachorro1.comer("pão",3);
        System.out.println(cachorro1);
        cachorro2.comer("linguiça",2);
        System.out.println(cachorro2);
        cachorro2.comer("frango",3);
        System.out.println(cachorro2);
        
    }
}
