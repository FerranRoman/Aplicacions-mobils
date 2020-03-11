package com.example.invitation_mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String TAG = "Main Activity";

    private int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Starting onCreate...");

        Bundle extres = getIntent().getExtras();
        assert extres != null; //assegurat que no es null lo que passes
        try{

            cont = cont + extres.getInt("contador");
            Log.d(TAG, "cont = " + cont);

            TextView numEvent = findViewById(R.id.textNumEvent);

            String resultat = "Create Events: " + cont;

            numEvent.setText(resultat);

        }catch(Exception e){
            Log.d(TAG, "Exption in onCreate... check " + e.getMessage());
        }


    }

    // Functions and variables names must be in camelCase
    // Class names must be start with capital letter
    public void siguiente(View view) {
        Log.d(TAG, "Button pressed function (siguient)... ");

        Intent siguiente = new Intent(this, CreaInvitation.class);

        // We should not hardcore the string message in text
        siguiente.putExtra(getResources().getString(R.string.counter), cont);

        Log.d(TAG, "Starting CrearInvitation class... ");
        startActivity(siguiente);
    }

}
