package com.example.invitation_mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.example.invitation_mvp.Controllers.Event_Controller;
import com.example.invitation_mvp.Models.Event;

import java.util.Calendar;

public class CreaInvitation extends AppCompatActivity {

    public Event_Controller event_controller;

    private TextView res_name;
    private TextView res_description;
    private TextView res_data;
    private int any, mes, dia, contad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crea_invitation);

        res_name = (TextView) findViewById(R.id.editTextNom);
        res_description = (TextView) findViewById(R.id.editTextDescrip);
        res_data = (TextView) findViewById(R.id.editTextData);




        //event_controller = new Event_Controller(this);
    }
    public void Anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);

        Bundle extres = getIntent().getExtras();
        assert extres != null;

        contad = contad + extres.getInt("contador");


        anterior.putExtra("contador", contad);

        startActivity(anterior);
    }
    public void data (View view){
        final Calendar c = Calendar.getInstance();
        dia = c.get(Calendar.DAY_OF_MONTH);
        mes = c.get(Calendar.MONTH);
        any = c.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                String fin = dayOfMonth+ "/" + (month+1) + "/" + year;
                res_data.setText(fin);
            }
        }
                , dia, mes, any);
        datePickerDialog.show();



    }
    public void create (View view){
        Intent create = new Intent(this, Mostra_Invitation.class);

        Bundle extres = getIntent().getExtras();
        assert extres != null;

        contad = contad + extres.getInt("contador");


        create.putExtra("contador", contad);
        create.putExtra("data", res_data.getText().toString());
        create.putExtra("event", res_name.getText().toString());
        create.putExtra("descrip", res_description.getText().toString());



        startActivity(create);
    }

}
