package com.cleber.bocodenota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private AnotacaoPreferencia preferencia;
    private EditText  editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton  fbSalvar  = findViewById(R.id.fb_salva);
        editAnotacao= findViewById(R.id.editAnotacao);

        preferencia = new AnotacaoPreferencia(getApplicationContext());
          
        fbSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textRecupera = editAnotcao.gettext().ToString();
                if (textRecupera.equals("")) {
                    Toast.makeText(getApplicationContext(), "Preencha a anotação "), Toast.LENGTH_SHORT.Show();

                }
            }
         }

        });
        }

    }


