package com.example.invitation_mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.invitation_mvp.Controllers.Event_Controller;
import com.example.invitation_mvp.Models.Event;

public class Mostra_Invitation extends AppCompatActivity {

    TextView TextRES;
    Event_Controller event_controller;
    int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra__invitation);

        recibirdatos();

        event_controller = new Event_Controller(this);


    }
    public void Anterior(View view){
        Intent anterior = new Intent(this, CreaInvitation.class);

        Bundle extres = getIntent().getExtras();
        assert extres != null;

        contador = contador + extres.getInt("contador");


        anterior.putExtra("contador", contador);

        startActivity(anterior);
    }
    public void recibirdatos(){
        Bundle extres = getIntent().getExtras();
        assert extres != null; //assegurat que no es null lo que passes

        String data = extres.getString("data");
        String event = extres.getString("event");
        String descrip = extres.getString("descrip");


        Event event1 = new Event(event, descrip, data);


        TextRES = (TextView) findViewById(R.id.textResultat);
        //String fin = "El event es diu "+ event + " i serà el dia " + data + " i consisteix en " + descrip;
        TextRES.setText(event1.toString());
    }
    public void accept(View view){
        Intent anterior = new Intent(this, MainActivity.class);

        Bundle extres = getIntent().getExtras();
        assert extres != null;
        contador = contador + extres.getInt("contador");

        contador += 1;

        anterior.putExtra("contador", contador);    //aqui li passem el contador


        /*Bundle extres = getIntent().getExtras();
        String data = extres.getString("data");
        String event = extres.getString("event");
        String descrip = extres.getString("descrip");
        TextRES = (TextView) findViewById(R.id.textResultat);
        String fin = "El event es diu "+ event + " i serà el dia " + data + " i consisteix en " + descrip;
        TextRES.setText(fin);*/


        startActivity(anterior);
    }
    public void updateUI(String message) {
        TextRES.setText(message);
    }

    public void updateBio(String bio){
        TextRES.setText(bio);
    }

}
