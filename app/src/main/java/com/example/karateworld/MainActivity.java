package com.example.karateworld;

import static com.example.karateworld.R.id.btnRegresar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etn,etc;
    private ImageView imagen;
    private Button boton_regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn =(EditText)findViewById(R.id.Nombre);
        etc = (EditText)findViewById(R.id.Contraseña);
        boton_regresar =(Button)findViewById(R.id.button);
        imagen = (ImageView)findViewById(R.id.first_image);
        imagen.setImageResource(R.drawable.karate);
        boton_regresar.setOnClickListener(new View.OnClickListener() {
            @Override
    public void onClick(View view) {
         if(etn.length()!=0 && etc.length()!= 0){
            startActivity(new Intent(MainActivity.this, Home.class));
            Toast.makeText(MainActivity.this,"Bienvenidx", Toast.LENGTH_LONG).show();
            Intent intencion = new  Intent(getApplicationContext(), Home.class);
            startActivity(intencion);
         }
         if(etn.length()== 0){
                    Toast.makeText(MainActivity.this,"Debes ingresar un nombre", Toast.LENGTH_LONG).show();
                }
         if(etc.length()== 0){
                    Toast.makeText(MainActivity.this,"Debes ingresar una contraseña", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    @Override
    public void onClick(View view) {
        Toast.makeText(this, "imprime", Toast.LENGTH_SHORT).show();
    }
}