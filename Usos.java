package listaaas;

import java.util.ArrayList;

public class Usos {
    /*filtrar o buscar elementos usando metodos como contains y remove
    contains sirve para ver sis si se encuentras ese elemento en la lsitas 
    revome es para eliminar un elemento de esa lista
    */
    public static void main(String[] args) {
        ArrayList<String>productos=new ArrayList<>();
        productos.add("mouse");
        productos.add("teclado");
        productos.add("laptop");
        
        if(productos.contains("mouse")){
            System.out.println("el producto mouse esta en el inventario");
        }

        productos.remove("teclado");
        System.out.println("total de productos "+productos.size());

    }
}
