package com.alb.mycarapplication;

import java.util.List;


public class Adapter {

    public List<MoldelCoche> cocheModelList;

    public Adapter(List<MoldelCoche> userModelList) {
        this.cocheModelList = userModelList;
    }


    /*
    public void delete() {

        moldelCoche.remove(0);
        notifyItemRemoved(0);
    } */

    public void ingresarDatos (String nombre_cochetxt , String colortxt) {

        MoldelCoche moldelCoche = new MoldelCoche();
        moldelCoche.set_nombre_coche(nombre_cochetxt);
        moldelCoche.set_color(colortxt);
        //moldelCoche.add(0, moldelCoche);
        //notifyItemInserted(0);
    }


}
