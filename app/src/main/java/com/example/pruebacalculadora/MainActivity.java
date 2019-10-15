package com.example.pruebacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

EditText number1,number2;
Button bt1,bt2,bt3,bt4;
TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText) findViewById(R.id.num1);
        number2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.res);
        bt1 = (Button) findViewById(R.id.btn1);
        bt2 = (Button) findViewById(R.id.btn2);
        bt3 = (Button) findViewById(R.id.btn3);
        bt4 = (Button) findViewById(R.id.btn4);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int n1 =Integer.parseInt(number1.getText().toString());
        int n2 =Integer.parseInt(number2.getText().toString());

        if (view.getId()==R.id.btn3)
        {
            result.setText("La multiplicacion es:" +(n1*n2));
        }
         else if (view.getId()==R.id.btn4)
        {
            Toast.makeText(this,"Esta es la division",Toast.LENGTH_LONG).show();
        }
        else if (view.getId()==R.id.btn1)
        {
            result.setText("La suma es:"+ (n1+n2));
        }
        else if (view.getId()==R.id.btn2)
        {
            result.setText("La resta es:" + (n1-n2));
        }
    }
}
