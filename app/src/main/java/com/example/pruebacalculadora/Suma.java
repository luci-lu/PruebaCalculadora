package com.example.pruebacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Suma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
    }

  public void Regresar (View view)

   {
      Intent intent = new Intent(this,Suma.class);
      startActivity(intent);

   }

}
