package com.cibertec.pruebacharlas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FranklinActivity extends AppCompatActivity {

    String nombres, apePaterno, apeMaterno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_franklin);
        //
        nombres = "Franklin";
        apePaterno = "Juarez";

    }
}
