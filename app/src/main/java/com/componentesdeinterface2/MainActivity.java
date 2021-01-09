package com.componentesdeinterface2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkVerde, checkBranco, checkVermelho;

    //RadioButton
    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //captura o que foi digitado pelo usuário
        campoNome =         findViewById(R.id.editNome);
        campoEmail =        findViewById(R.id.editEmail);
        textoResultado =    findViewById(R.id.textResultado);

        //checkboox

        checkVerde =        findViewById(R.id.checkVerde);
        checkBranco =       findViewById(R.id.checkBranco);
        checkVermelho =     findViewById(R.id.checkVermelho);

        //RadioButton
        sexoFeminino = findViewById(R.id.radioFeminino);
        sexoMasculino = findViewById(R.id.radioMasculino);
        opcaoSexo = findViewById(R.id.radioGroupSexo);
        radioButton();

    }

    public void radioButton() {

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            //checkedId é o identificador do item selecionado: masculino ou feminino
            public void onCheckedChanged(RadioGroup group, int checkedId)  {
                if(checkedId == R.id.radioFeminino){
                    textoResultado.setText( "feminino selecionado" );
                } else {
                    textoResultado.setText( "masculino selecionado" );
                }
            }
        });

       /* String texto = "";

        if(sexoFeminino.isChecked()){
            texto = "Feminino selecionado";
        }
        else {
            texto = "Masculino selecionado";
        }

        textoResultado.setText( texto );

        */

    }


    public void enviar (View view){

     //   radioButton();
     //   checkbox();
        /*
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        textoResultado.setText( "nome: " + nome + " email: " + email );

         */

    }

    public void checkbox(){

        String texto = "";

        if(checkVerde.isChecked()) {
            // String corSelecionada = checkVerde.getText().toString(); // para capturar exatamente o que está escrito no checkbox
            // texto = corSelecionada;
            texto = "Verde selecionado - ";
        }
        if(checkBranco.isChecked()) {
            texto = texto + "Branco selecionado - ";
        }
        if(checkVermelho.isChecked()) {
            texto = texto + "Vermelho selecionado - ";
        }

        textoResultado.setText( texto );
    }

    public void limpar(View view){

        campoNome.setText("");
        campoEmail.setText("");

    }
}