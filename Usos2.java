package listaaas;

import java.util.ArrayList;

public class Usos2 {
    //implementar un historial de acciones 
    //get sirve para obtener un elemento de la lista usando su posiscion 
    public static void main(String[] args) {
        ArrayList<String>historial=new ArrayList<>();
        historial.add("Abrir pagina");
        historial.add("Seleccionar producto");
        historial.add("Colocar en el carrito");

        int ultimaPosicion=historial.size()-1;
        System.out.println("ultima accion "+ historial.get(ultimaPosicion));
       
    }
}
