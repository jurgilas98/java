
package br.com.bandtec.projetolistas;

import java.util.ArrayList;
import java.util.List;

public class ProgramaListas {
    public static void main(String[] args) {
        //Lista que aceita qualquer coisa
        
        List listaLoka = new ArrayList<>();
        
        listaLoka.add("Milho"); 
        listaLoka.add(40); 
        listaLoka.add(3.75); 
        listaLoka.add(true);
        
        System.out.println(listaLoka);
        
        //lista que aceita 1 tipo de dado
        List<String> textos = new ArrayList<>();
        textos.add("maracujá");
        textos.add("goiaba");
        textos.add("banana");
        textos.add("maça");
        System.out.println(textos);

        // Lista de numero reais
        
        List<Double> reias = new ArrayList<>();
        
        //Navegando numa lista 
        
        System.out.println(textos.get(2));
        
        //Navegando em TODOS os elementos
        
        //Metodo 1 - for "Clássico"
        for(int t=0 ; t<textos.size() ;t++){
            System.out.println(textos.get(t));
        }
        
        //Metodo 2 - enhanced for (ou "for each")
        
        for (String texto : textos){
            System.out.println(texto);
        }
        
        //Metodo 2 (Para lista q aceita tudo)- enhanced for (ou "for each")
        
        for (Object item : listaLoka){
            System.out.println(item);
        }
        
        // Metodo 3 - com função lambda 
        
        textos.forEach(texto -> System.out.println(texto));
        
        //loop com lambda para varias linhas de código
        
        textos.forEach(texto -> {
            //
            //
            
            System.out.println(texto);
            
            //
            //
            
        });
        
        
        
        // Remover elementos de uma lista
        
        listaLoka.remove(0);
        
        System.out.println(listaLoka);
        
        // O que estava na posição 1, vai para 0 e assim em diante
        
        textos.remove("banana"); //vai remover o item de valor "banana"
        
        System.out.println(textos);
        
        // Remover TODOS
        
        listaLoka.clear();
        
        System.out.println(listaLoka);
        
        //Verifiando quantidade de itens
        System.out.println("Quantos textos?"+textos.size());
        
        System.out.println("Textos vazia?"+textos.isEmpty());   
        System.out.println("Loka vazia?"+listaLoka.isEmpty());


    }
}
