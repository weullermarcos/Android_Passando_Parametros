package com.example.weuller.passandoparametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText edtValor;
    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor = (EditText) findViewById(R.id.edtValor);
        btnOK = (Button) findViewById(R.id.btnOK);

        //registra o evento criado para que possa ocorrer a ação
        //MUITO IMPORTANTE ESSE PASSO, SEM ISSO NÃO FUNCIONA
        btnOK.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        //criando um intent para fazer navegação entre as activitys
        //ele espera como parâmetro a classe que está navegando e a classe de destino
        Intent it = new Intent(this, ActSegundaTela.class);

        //passando parametros para a proxima activity
        //é necessário informar o nome do parametro e o seu valor
        it.putExtra("VALOR", edtValor.getText().toString());

        //iniciando a activity de destino
        startActivity(it);

    }
}
