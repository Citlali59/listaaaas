package listaaas;

import java.util.ArrayList;

public class list1 {
    public static void main(String[] args){
        ArrayList<Integer>numero=new ArrayList<>();
        numero.add(1);
        numero.add(2);
        numero.add(3);
        System.out.println("los numero en la lista son "+numero);

        ArrayList<String>texto=new ArrayList<>();
        texto.add("Citlali");
        texto.add("Luis");
        texto.add("Cesiii");
        System.out.println("los nombres en la lista son: "+texto);


        ArrayList<Boolean>valor=new ArrayList<>();
        valor.add(true);
        valor.add(false);
        valor.add(false);
        System.out.println("los valores de la listas son: "+valor);


        
    }
}
