package com.example.quiz.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class comecar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comecar);
    }

    public void comecar(View v){
        //TODO encaminha para tela de respostas com o nome MainActivity
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
