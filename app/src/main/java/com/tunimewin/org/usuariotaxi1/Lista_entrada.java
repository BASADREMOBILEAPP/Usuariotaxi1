package com.tunimewin.org.usuariotaxi1;

import android.app.Activity;

/**
 * Created by anderson on 11/01/2015.

 */

public class Lista_entrada  extends Activity{

    //crea una variable donde se dirigir la imagen
    private int idImagen;
    //crea la variable donde se pondra el teto de encima
    private String textoEncima;
    //creamos el teto del medio
    private String testomedio;
    // crea el texo donde se pondra el texto de abajo
    private String textoDebajo;


    //una funcion donde introduciomos  los textos y la imagen
    public Lista_entrada (int idImagen, String textoEncima, String textoDebajo) {

        //this la recoge los formatos
        this.idImagen = idImagen;
        this.textoEncima = textoEncima;
        this.textoDebajo = textoDebajo;
    }

    //son las funciones que nos permiten  coger la informacion
    public String get_textoEncima() {
        return textoEncima;
    }

    public String get_textoDebajo() {
        return textoDebajo;
    }

    public int get_idImagen() {
        return idImagen;
    }
}