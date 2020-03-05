package com.example.invitation_mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView NumEvent;
    private int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Bundle extres = getIntent().getExtras();
        assert extres != null; //assegurat que no es null lo que passes
        try{
            cont = cont + extres.getInt("contador");

            NumEvent = (TextView) findViewById(R.id.textNumEvent);

            String resultat = "Create Events: " + cont;

            NumEvent.setText(resultat);

        }catch(Exception e){

        }

        /*NumEvent = (TextView) findViewById(R.id.textNumEvent);

        String resultat = "Create Events: " + cont;

        NumEvent.setText(resultat);*/


        //contador = contador + 1;
        //NumEvent.setText(resultat);
        //no funciona el contador
        //esta mal fet el contador pk si tiro atras augmentara
        //pero no puc passar los datos de la 3a pk sino la primera vegada k lo obris peta



    }
    public void Siguiente (View view) {
        Intent siguiente = new Intent(this, CreaInvitation.class);

        siguiente.putExtra("contador", cont);

        startActivity(siguiente);
    }

}
