package com.pruebas.punto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.pruebas.punto1.adapter.ProductoAdapter;
import com.pruebas.punto1.model.Producto;
import com.pruebas.punto1.model.ProductosTmp;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Producto> productos;
    private ProductoAdapter productoAdapter;
    private ListView lvProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvProductos = (ListView) findViewById(R.id.lvProductos);
        loadProductos();
        productoAdapter = new ProductoAdapter(this, productos);
        lvProductos.setAdapter(productoAdapter);


    }

    private void loadProductos() {
        this.productos = ProductosTmp.getProductos();
    }
}
