import superclase.Arroz;
import superclase.Articulo;
import superclase.Leche;
import superclase.Vino;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {


    public static final void main(String[] args) {
        List<Articulo> articulos = new ArrayList<>();
        articulos.add(new Arroz("00123",  "Doña Pepa",1000, new Date(), "Integral"));
        articulos.add(new Leche("00124",  "Colanta",5000, new Date(), false));
        articulos.add(new Vino("00125",  "Gato Negro",10000, new Date(), 15));

        for (int i = 0; i < articulos.size(); i++) {
            System.out.println("Artículo: " +  articulos.get(i).getNombre() +
                    " Precio Final:"  +  articulos.get(i).obtenerPrecio());


        }

    }
}







