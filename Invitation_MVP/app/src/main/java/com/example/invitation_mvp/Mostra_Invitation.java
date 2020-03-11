package com.example.invitation_mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.invitation_mvp.Controllers.Event_Controller;
import com.example.invitation_mvp.Models.Event;

public class Mostra_Invitation extends AppCompatActivity {

    TextView textViewResult;
    EventPresenter event_presenter;
    int contador = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra__invitation);
        event_presenter = new EventPresenter(this);
        recibirdatos();
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

        event_presenter.setEvent(event, descrip, data);
        textViewResult = findViewById(R.id.textResultat);
        event_presenter.showEvent();


        //String fin = "El event es diu "+ event + " i serà el dia " + data + " i consisteix en " + descrip;
        //textViewResult.setText(event1.toString());
    }
    public void accept(View view){
        Intent anterior = new Intent(this, MainActivity.class);

        Bundle extres = getIntent().getExtras();
        assert extres != null;
        contador = contador + extres.getInt("contador");

        contador += 1;

        anterior.putExtra("contador", contador);    //aqui li passem el contador

        startActivity(anterior);
    }



    @Override
    public void UpdateUI(String message) {
        textViewResult.setText(message);
    }
}
