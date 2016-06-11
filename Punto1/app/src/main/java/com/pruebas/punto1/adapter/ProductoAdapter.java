package com.pruebas.punto1.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.pruebas.punto1.R;
import com.pruebas.punto1.model.Producto;
import com.pruebas.punto1.model.ProductoHolder;

import java.util.List;

/**
 * Created by equipo on 11/06/16.
 */
public class ProductoAdapter extends BaseAdapter {

    private Context context;
    private List<Producto> productos;

    public ProductoAdapter(Context context, List<Producto> productos) {
        this.context = context;
        this.productos = productos;
    }

    @Override
    public int getCount() {
        return productos.size();
    }

    @Override
    public Object getItem(int position) {
        return this.productos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View tmp = convertView;
        ProductoHolder holder;

        if (tmp == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            tmp = inflater.inflate(R.layout.adapt_list_productos, null);
            holder = new ProductoHolder();
            holder.view = tmp;
            holder.nombre = (TextView) tmp.findViewById(R.id.productoNombre);
            holder.nombre.setText(productos.get(position).getNombre());
            tmp.setTag(holder);
        } else {
            holder = (ProductoHolder) tmp.getTag();
        }
        return tmp;
    }
}
