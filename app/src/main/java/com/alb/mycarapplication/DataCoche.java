package com.alb.mycarapplication;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class DataCoche {

    private static SharedPreferences sharedPreferences;

    public static void init(Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences("MYPRESS", Activity.MODE_PRIVATE);
        }
    }

    public static  void saveName (List<MoldelCoche> list ) {
        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        Gson gson = new Gson();
        String notasJSON = gson.toJson(list);
        prefsEditor.putString("coche", notasJSON);
        prefsEditor.apply();

    }

    public static List<MoldelCoche> loadName()  {
        Gson gson = new Gson();

        String notasJSON = sharedPreferences.getString("coches", "");
        Type tipe = new TypeToken<List<MoldelCoche>>(){}.getType();
        return gson.fromJson(notasJSON, tipe);

    }

}
