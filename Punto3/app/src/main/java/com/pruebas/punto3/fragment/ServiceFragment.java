package com.pruebas.punto3.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pruebas.punto3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ServiceFragment extends Fragment {

    private static final String INDICE = "indice";
    private static final String NOMBRE = "nombre";
    //TODO: Estado

    public ServiceFragment() {
        // Required empty public constructor
    }

    public static ServiceFragment newInstance(int indice, String nombre) {
        ServiceFragment tmp = new ServiceFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(INDICE, indice);
        bundle.putString(NOMBRE, nombre);
        tmp.setArguments(bundle);
        tmp.setRetainInstance(true);
        return tmp;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_service, container, false);
    }

}
