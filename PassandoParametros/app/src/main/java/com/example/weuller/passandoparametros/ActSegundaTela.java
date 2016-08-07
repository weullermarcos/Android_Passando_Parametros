package com.example.weuller.passandoparametros;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActSegundaTela extends AppCompatActivity implements View.OnClickListener{

    private EditText edtValor;
    private Button btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_segunda_tela);

        edtValor = (EditText) findViewById(R.id.edtValor);
        btnFechar = (Button) findViewById(R.id.btnFechar);

        //registra o evento criado para que possa ocorrer a ação
        //MUITO IMPORTANTE ESSE PASSO, SEM ISSO NÃO FUNCIONA
        btnFechar.setOnClickListener(this);

        //recuperando os parametros que foram passados da activity anterior para esta
        Bundle bundle = getIntent().getExtras();

        //verifica se existe o parametro passado pela sua chave
        if (bundle.containsKey("VALOR")){

            //recupera o parametro passado pela chave
            String valor = bundle.getString("VALOR");

            //seta no campo de texto o valor recebido
            edtValor.setText(valor);

        }

    }

    @Override
    public void onClick(View v) {

        //finaliza a activity
        finish();

    }
}
