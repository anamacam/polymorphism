import superclase.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {


    public static final void main(String[] args) {
        List<Articulo> articulos = new ArrayList<>();
        articulos.add(new Arroz("00123",  "Doña Pepa",1000, new Date(), "Integral"));
        articulos.add(new Leche("00124",  "Colanta",5000, new Date(), false));
        articulos.add(new Vino("00125",  "Gato Negro",10000, new Date(), 15));
        articulos.add(new Bebida("00126","Zebenat",1200, new Date(),"Carbonatada "));
        articulos.add(new Aceite("00127","Gurmet",22000, new Date(), "Multiuso"));

        for (int i = 0; i < articulos.size(); i++) {
            System.out.println("Artículo: " +  articulos.get(i).getNombre() +
                    " Precio Final:"  +  articulos.get(i).obtenerPrecio());


        }

    }
}







