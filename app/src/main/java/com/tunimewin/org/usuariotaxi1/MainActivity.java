package com.tunimewin.org.usuariotaxi1;

import android.support.v7.app.ActionBarActivity;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity {

    // creaa una varible   privada
    private ListView lista;
    //esta es la  funcion  es principal y crusial
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // nos manda al layout principal
        setContentView(R.layout.listado);

        //creamos un array para los paramentros
        ArrayList<Lista_entrada> datos = new ArrayList<Lista_entrada>();

        datos.add(new Lista_entrada(R.drawable.user, "juanito", "en  su casa", "el tiempo estimado es de 1 hora"));
        datos.add(new Lista_entrada(R.drawable.user, "julio", "ciudad  de los unicornios donde vive piter pan hijo de campanita", "el tiempo estimado es de 1 hora"));
        datos.add(new Lista_entrada(R.drawable.user, "tunime", "las americas M.W lt.11", "el tiempo estimado es de 1 hora"));
        lista = (ListView) findViewById(R.id.ListView_listado);
        lista.setAdapter(new Lista_adaptador(this, R.layout.entrada, datos){
            @Override
            public void onEntrada(Object entrada, View view) {
                if (entrada != null) {
                    TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textView_superior);
                    if (texto_superior_entrada != null)
                        texto_superior_entrada.setText(((Lista_entrada) entrada).get_textoEncima());

                    TextView texto_inferior_entrada = (TextView) view.findViewById(R.id.textView_inferior);
                    if (texto_inferior_entrada != null)
                        texto_inferior_entrada.setText(((Lista_entrada) entrada).get_textoDebajo());

                    TextView texto_medio_entrada = (TextView) view.findViewById(R.id.textView_medio);
                    if (texto_medio_entrada != null)
                        texto_medio_entrada.setText(((Lista_entrada) entrada).get_textomedio());

                    ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imageView_imagen);
                    if (imagen_entrada != null)
                        imagen_entrada.setImageResource(((Lista_entrada) entrada).get_idImagen());
                }
            }
        });

        lista.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> pariente, View view, int posicion, long id) {
                Lista_entrada elegido = (Lista_entrada) pariente.getItemAtPosition(posicion);

                CharSequence texto = "Seleccionado: " + elegido.get_textoDebajo();
                Toast toast = Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }

}