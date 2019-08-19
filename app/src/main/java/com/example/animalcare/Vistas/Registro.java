package com.example.animalcare.Vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;


import com.example.animalcare.R;

public class Registro extends AppCompatActivity {
    EditText txtNombre;
    EditText txtCodigo;
    EditText txtTipo;
    EditText txtRaza;
    TextView txtFecha;
    CalendarView Date;
    Button btnRegistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        inicializar();
    }


    public void inicializar(){
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtCodigo = (EditText) findViewById(R.id.txtCodigo);
        txtTipo = (EditText) findViewById(R.id.txtTipo);
        txtRaza = (EditText) findViewById(R.id.txtRaza);
        txtFecha = (TextView) findViewById(R.id.txtFecha);
        Date = (CalendarView) findViewById(R.id.Date);
        btnRegistrar = (Button) findViewById(R.id.btnRegistrar);
    }
}
