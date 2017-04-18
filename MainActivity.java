package com.example.quiz.quiz;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.quiz.quiz.R.string.result;
import static com.example.quiz.quiz.R.string.resultMedia;

public class MainActivity extends AppCompatActivity {

    //TODO declaro minhas variaveis;
    TextView resul;
    TextView resulMedia;
    Integer nota = 0;
    Integer Media = 0;

    RadioButton R1a;
    RadioButton R1b;
    RadioButton R1c;
    RadioButton R2a;
    RadioButton R2b;
    RadioButton R2c;
    RadioButton R3a;
    RadioButton R3b;
    RadioButton R3c;
    RadioButton R4a;
    RadioButton R4b;
    RadioButton R4c;
    RadioButton R5a;
    RadioButton R5b;
    RadioButton R5c;
    RadioButton R6a;
    RadioButton R6b;
    RadioButton R6c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resul  = (TextView)findViewById(R.id.resul);
        resulMedia  = (TextView)findViewById(R.id.resulMedia);

        R1a = (RadioButton)findViewById(R.id.R1a);
        R1b = (RadioButton)findViewById(R.id.R1b);
        R1c = (RadioButton)findViewById(R.id.R1c);
        R2a = (RadioButton)findViewById(R.id.R2a);
        R2b = (RadioButton)findViewById(R.id.R2b);
        R2c = (RadioButton)findViewById(R.id.R2c);
        R3a = (RadioButton)findViewById(R.id.R3a);
        R3b = (RadioButton)findViewById(R.id.R3b);
        R3c = (RadioButton)findViewById(R.id.R3c);
        R4a = (RadioButton)findViewById(R.id.R4a);
        R4b = (RadioButton)findViewById(R.id.R4b);
        R4c = (RadioButton)findViewById(R.id.R4c);
        R5a = (RadioButton)findViewById(R.id.R5a);
        R5b = (RadioButton)findViewById(R.id.R5b);
        R5c = (RadioButton)findViewById(R.id.R5c);
        R6a = (RadioButton)findViewById(R.id.R6a);
        R6b = (RadioButton)findViewById(R.id.R6b);
        R6c = (RadioButton)findViewById(R.id.R6c);

    }

    public void voltar(View v){
        //TODO volta para tela inicial de nome comecar
        Intent intent = new Intent(this, comecar.class);
        startActivity(intent);
    }


    public void VerificarRadio(View v){

        nota = 0;
        Media = 0;
        if(R1b.isChecked()){
            nota++;
        }
        if(R2a.isChecked()){
            nota++;
        }
        if(R3c.isChecked()){
            nota++;
        }
        if(R4b.isChecked()){
            nota++;
        }
        if(R5c.isChecked()){
            nota++;
        }
        if(R6b.isChecked()){
            nota++;
        }

        Media = (nota/6)*100; //TODO calcula a média que o usuário recebeu

        if(nota >= 4) {
            resul.setTextColor(Color.GREEN);
        }else{
            resul.setTextColor(Color.RED);
        }
        if(Media >= 60) {
            resulMedia.setTextColor(Color.GREEN);
        }else{
            resulMedia.setTextColor(Color.RED);
        }
        resul.setText("Você acertou "+nota.toString()+" questões"); //TODO Exibira quantas questões o usuário acertou
        resulMedia.setText("Sua média foi " + Media.toString() + " %"); //TODO Exibira qual a porcentagem que o usuário acertou
    }
}
