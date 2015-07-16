package com.cenatel.desarrollo.sigseg_inia_mat;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by simaski on 22/06/2015.
 */
public class VerRegistrosFragment extends Fragment {
    private ListView listView;
    private ArrayAdapter<String> adaptador ;
    private SQLite sqlite;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_verreegistros, container, false);
        listView = (ListView) v.findViewById( R.id.lstRegistros );
        //Abre conexion a sqlite
        sqlite = new SQLite(getActivity());
        sqlite.abrir();
        //obtiene registros e imprimir en el listview
        Cursor cursor = sqlite.getRegistros();
        ArrayList<String> listData2 = sqlite.getFormatListaPrimera( cursor );
        adaptador = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1  , listData2 );
        listView.setAdapter( adaptador );
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object object = listView.getItemAtPosition( position );
                //Se extrae el ID = [X]
                int posicionInicial = object.toString().indexOf("") + 1;
                int posicionFinal = object.toString().indexOf("", posicionInicial);
                String resultado =  object.toString().substring(posicionInicial, posicionFinal);
                //ejecuta nueva actividad
                Bundle b = new Bundle();
                b.putInt("id", Integer.valueOf(resultado) );
                /*PuntosFragment fragment2 = new PuntosFragment();
                android.support.v4.app.FragmentTransaction fragmentTransaction2 = getFragmentManager().beginTransaction();
                fragmentTransaction2.replace(R.id.frame, fragment2);
                fragmentTransaction2.commit();*/
                Intent iRegs = new Intent( getActivity(), PuntosFragment.class );
                iRegs.putExtras(b);
                startActivity(iRegs);

            }
        });

        if( listData2.size()== 0 )
        {
            Toast.makeText(getActivity(), "No existen registros", Toast.LENGTH_SHORT).show();
        }
        //
        return v;
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.registros, menu);
        return true;
    }*/




}