package com.cenatel.desarrollo.sigseg_inia_mat;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 04-06-2015.
 */
public class PuntosFragment extends Fragment {
    private TextView textView;
    private SQLite sqlite;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_puntos,container,false);


        textView = (TextView) v.findViewById(R.id.txtResultado);
        //textView.setTextSize(28);
        textView.setText( ""  );
        /*Intent i = getActivity().getIntent();
        Bundle bundle = i.getExtras();
        if ( bundle != null ) {*/
            int id = 1;//bundle.getInt("id");
            //base de datos
            sqlite = new SQLite(getActivity());
            sqlite.abrir();
            Cursor cursor = sqlite.getRegistro(id);
            ArrayList<String> reg = sqlite.getFormatListUniv(cursor);
            textView.setText( reg.get(0)  );
        //}
        //
        return v;
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.registros, menu);
        return true;
    }*/

}