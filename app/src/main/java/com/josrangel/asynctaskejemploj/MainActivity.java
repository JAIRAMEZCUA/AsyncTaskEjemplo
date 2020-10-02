package com.josrangel.asynctaskejemploj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MiAsyncTask.PublicaUI{

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.ediTextNumero);
        //new MiAsyncTask(this).execute(6);
    }

    public void muestraResultado(View v){
        double numero=Double.valueOf(editText.getText().toString());
        new MiAsyncTask(this).execute(numero);
    }

    @Override
    public void regresa(String resultado) {
        Toast.makeText(this, resultado,Toast.LENGTH_LONG).show();
    }
}