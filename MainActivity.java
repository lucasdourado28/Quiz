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
    EditText p1;
    EditText p2;
    EditText p3;
    EditText p4;
    EditText p5;
    EditText p6;
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

        //TODO pego os valores das minhas variaveis dizendo que elas viram de um editText;
//        p1 = (EditText)findViewById(R.id.p1);
//        p2 = (EditText)findViewById(R.id.p2);
//        p3 = (EditText)findViewById(R.id.p3);
//        p4 = (EditText)findViewById(R.id.p4);
//        p5 = (EditText)findViewById(R.id.p5);
//        p6 = (EditText)findViewById(R.id.p6);
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

    //TODO método chamado quando o usuário clica no botão finalizar, chamei ele por meio de Onclick
//    public void btnFim(View v){
//        if (p1.getText().toString().trim().isEmpty()){ //TODO verifica se o campo está vazio
//            p1.setError("Responda esta questão");
//            //TODO emite mensagem de erro no campo nome quando nao for preenchido
//        }
//        else if (p2.getText().toString().trim().isEmpty()){ //TODO verifica se o campo está vazio
//            p2.setError("Responda esta questão");
//            //TODO emite mensagem de erro no campo nome quando nao for preenchido
//        }
//        else if (p3.getText().toString().trim().isEmpty()){ //TODO verifica se o campo está vazio
//            p3.setError("Responda esta questão");
//            //TODO emite mensagem de erro no campo nome quando nao for preenchido
//        }
//        else if (p4.getText().toString().trim().isEmpty()){ //TODO verifica se o campo está vazio
//            p4.setError("Responda esta questão");
//            //TODO emite mensagem de erro no campo nome quando nao for preenchido
//        }
//        else if (p5.getText().toString().trim().isEmpty()){ //TODO verifica se o campo está vazio
//            p5.setError("Responda esta questão");
//            //TODO emite mensagem de erro no campo nome quando nao for preenchido
//        }
//        else if (p6.getText().toString().trim().isEmpty()){ //TODO verifica se o campo está vazio
//            p6.setError("Responda esta questão");
//            //TODO emite mensagem de erro no campo nome quando nao for preenchido
//        }
//        else{
//            //TODO verifico se a variavel é igual a resposta correta
//            if(p1.getText().toString().equals("variavel constante")){
//                p1.setTextColor(Color.GREEN);
//                nota++;
//            }else{
//                p1.setTextColor(Color.RED);
//            }
//
//            if (p2.getText().toString().equals("mesmo valor para todos metodos")){
//                p2.setTextColor(Color.GREEN);
//                nota++;
//            }else{
//                p2.setTextColor(Color.RED);
//            }
//
//            if(p3.getText().toString().equals("utilizando o EXTENDS")){
//                p3.setTextColor(Color.GREEN);
//                nota++;
//            }else {
//                p3.setTextColor(Color.RED);
//            }
//
//            if (p4.getText().toString().equals("permite que voce execute acoes")){
//                p4.setTextColor(Color.GREEN);
//                nota++;
//            }else {
//                p4.setTextColor(Color.RED);
//            }
//
//            if(p5.getText().toString().equals("funcoes")){
//                p5.setTextColor(Color.GREEN);
//                nota++;
//            }else {
//                p5.setTextColor(Color.RED);
//            }
//
//            if (p6.getText().toString().equals("logica") || p6.getText().toString().equals("Logica")){
//                p6.setTextColor(Color.GREEN);
//                nota++;
//            }else {
//                p6.setTextColor(Color.RED);
//            }
//
//            Media = (nota/6)*100; //TODO calcula a média que o usuário recebeu
//
//            if(nota >= 4) {
//                resul.setTextColor(Color.GREEN);
//            }else{
//                resul.setTextColor(Color.RED);
//            }
//            if(Media > 60) {
//                resulMedia.setTextColor(Color.GREEN);
//            }else{
//                resulMedia.setTextColor(Color.RED);
//            }
//
//        }
//    }

    public void voltar(View v){
        //TODO volta para tela inicial de nome comecar
        Intent intent = new Intent(this, comecar.class);
        startActivity(intent);
    }

//    public void verificaRadio(View v){
//        switch (v.getId()){
//            case R.id.r1:
//                Toast.makeText(this,"O r1 está marcado "+R1.getText(), Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.r2:
//                Toast.makeText(this,"O r2 está marcado "+R1.getText(), Toast.LENGTH_SHORT).show();
//                break;
//        }
//    }

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
