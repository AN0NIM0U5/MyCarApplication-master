package com.alb.mycarapplication;

public class MoldelCoche {

    // private int numero_ruedas;
    private String nombre_coche;
    private String color;

//Declarar variables publicas

    public MoldelCoche() {
        nombre_coche = " ";
        color = " ";
        //numero_ruedas = 0;
    }
    public MoldelCoche(String P_nombre_coche, String P_color/*,int P_numero_ruedas*/) {

        //this.numero_ruedas= P_;
        this.color = P_color;
        this.nombre_coche = P_nombre_coche;
    }
    //Captura y escritura

    public void set_nombre_coche(String P_nombre_coche) { nombre_coche = P_nombre_coche; }

    public String get_nombre_coche() { return nombre_coche; }

    public void set_color(String P_color) { color = P_color; }

    public String getColor() { return color; }



}
