package com.alb.mycarapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity /*, Fragment*/ implements /*BlankFragment,*/ComunicaMenus {
    //{LayoutInflater inflater, ViewGroup container


    Button btnDelete;
    Button btnAdd;



    protected void onCreate(Bundle savedInstanceState, LayoutInflater inflater, ViewGroup container) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // DataCoche.init(getApplicationContext(R.layout.));

        final Adapter newAdaptador;
        newAdaptador = new Adapter(_coche());
        btnAdd.setOnClickListener(new View.OnClickListener() {
            //btnAdd = findViewById(R.id.btnAddXlm);//layaout fragment Colores
            @Override
            public void onClick(View view) {
                newAdaptador.ingresarDatos("1", "2");
            }
        });

        /////////
        // inflate layaout



    }



    public void menu(int botonSelecionado){
        Intent  intent = new Intent(this,SpinnerFragment.class);
        intent.putExtra("BOTON_SELECIONADO", botonSelecionado);
    }



    public List<MoldelCoche> _coche () {

        MoldelCoche MoldelCoche0 = new MoldelCoche();
        MoldelCoche MoldelCoche1= new MoldelCoche();
        MoldelCoche MoldelCoche2 = new MoldelCoche();
        MoldelCoche MoldelCoche3 = new MoldelCoche();
        MoldelCoche MoldelCoche4 = new MoldelCoche();


        MoldelCoche0.set_nombre_coche("L");
        MoldelCoche1.set_nombre_coche("A");
        MoldelCoche2.set_nombre_coche("M");
        MoldelCoche3.set_nombre_coche("B");
        MoldelCoche4.set_nombre_coche("J");

        MoldelCoche0.set_color("AZUL");
        MoldelCoche0.set_color("ROJO");
        MoldelCoche0.set_color("VERDE");
        MoldelCoche0.set_color("AMARILLO");
        MoldelCoche0.set_color("BLANCO");

        List<MoldelCoche> arrayCoche = new ArrayList<>();
        arrayCoche.add(MoldelCoche0);
        arrayCoche.add(MoldelCoche1);
        arrayCoche.add(MoldelCoche2);
        return arrayCoche;
    }


}
