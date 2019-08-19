package com.example.animalcare.Vistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import com.example.animalcare.R;

public class Buscar extends AppCompatActivity {
    TextView txtBusqueda, txtResultado;
    EditText txtBuscar;
    Button btnBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);

    }
    public void inicializar(){
        txtBusqueda = (TextView) findViewById(R.id.txtBusqueda);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        txtBuscar = (EditText) findViewById(R.id.txtBuscar);
        btnBuscar = (Button) findViewById(R.id.btnBuscar);

    }
}

