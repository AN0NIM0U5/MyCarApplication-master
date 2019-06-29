package com.alb.mycarapplication;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class Menu extends Fragment {
    private final int[] MIMENU={R.id.colorAzulXml,R.id.colorBlancoxml,R.id.colornegroXml,R.id.colorRojoXml};
    ImageButton btnMenu;

    public Menu(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedIntanceState){

        View windowsMenu = inflater.inflate(R.layout.fragment_menu, container, false);


        for (int i = 0; i < MIMENU.length; i++) {
            btnMenu = (ImageButton) windowsMenu.findViewById(MIMENU[i]);

            final int botonSelecionado = i;

            btnMenu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Activity activitis = getActivity();
                    /*casting*/
                    ((ComunicaMenus) activitis).menu(botonSelecionado);
                }
            });
        }

    //    return inflater.inflate(R.layout.fragment_menu,container,false);
       return windowsMenu;
    }

}






