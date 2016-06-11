package com.pruebas.punto3.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pruebas.punto3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SlideFragment extends Fragment {

    private static final String INDICE = "indice";
    private static final String NOMBRE = "nombre";
    private int indice;
    private String nombre;

    public SlideFragment() {
        // Required empty public constructor
    }

    public static SlideFragment newInstance(int indice, String nombre) {
        SlideFragment tmp = new SlideFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(INDICE, indice);
        bundle.putString(NOMBRE, nombre);
        tmp.setArguments(bundle);
        tmp.setRetainInstance(true);
        return tmp;
    }

    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        this.indice = (getArguments() != null) ? getArguments().getInt(INDICE) : -1;
        this.nombre = (getArguments() != null) ? getArguments().getString(NOMBRE): "Vacío";
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup vg = (ViewGroup) inflater.inflate(R.layout.fragment_slide, container, false);

        TextView tv = (TextView) vg.findViewById(R.id.tview);
        tv.setText(nombre);
        return vg;
    }

}
