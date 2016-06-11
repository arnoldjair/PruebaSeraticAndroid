package com.pruebas.punto1.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by equipo on 11/06/16.
 */
public class ProductosTmp {

    //Datasource temporal productos;
    public static List<Producto> getProductos() {
        List<Producto> ret = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Producto tmp = new Producto();
            tmp.setNombre("Producto" + (i + 1));
            tmp.setMarca("Marca" + (i + 1));
            tmp.setPrecio(1000);
            ret.add(tmp);
        }

        return ret;
    }
}
