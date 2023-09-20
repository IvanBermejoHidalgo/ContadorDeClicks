package com.example.clicks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.clicks.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    int numClicks = 0;
    int numClicks1 = 0;
    int numClicks2 = 0;
    int numClicks3 = 0;

    int numClicks4 = 0;
    int total = 0;

    ActivityMainBinding binding;

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

        numClicks = 0;

        binding.contador.setText("Has clicado " + numClicks + " veces");

        binding.boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numClicks++;
                binding.contador.setText("Has clicado " + numClicks + " veces");
            }
        });

    }*/

    public void SumaTotal() {
        total = numClicks1 + numClicks2 + numClicks3 + numClicks4;
        binding.contadortotal.setText(String.valueOf(total));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

        numClicks1 = 0;
        numClicks2 = 0;
        numClicks3 = 0;
        numClicks4 = 0;

        binding.mas11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numClicks1++;
                binding.contador1.setText(""+numClicks1+"");
                SumaTotal();
            }
        });

        binding.reset1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                numClicks1=0;
                binding.contador1.setText(""+numClicks1+"");
                SumaTotal();
            }
        });



        binding.mas12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numClicks2++;
                binding.contador2.setText(""+numClicks2+"");
                SumaTotal();
            }
        });

        binding.reset2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                numClicks2=0;
                binding.contador2.setText(""+numClicks2+"");
                SumaTotal();
            }
        });




        binding.mas13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numClicks3++;
                binding.contador3.setText(""+numClicks3+"");
                SumaTotal();
            }
        });

        binding.reset3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                numClicks3=0;
                binding.contador3.setText(""+numClicks3+"");
                SumaTotal();
            }
        });




        binding.mas14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numClicks4++;
                binding.contador4.setText(""+numClicks4+"");
                SumaTotal();
            }
        });

        binding.reset4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                numClicks4=0;
                binding.contador4.setText(""+numClicks4+"");
                SumaTotal();
            }
        });



        binding.resetall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                total = 0;
                numClicks1 = 0;
                numClicks2 = 0;
                numClicks3 = 0;
                numClicks4 = 0;
                binding.contadortotal.setText(String.valueOf(total));
                binding.contador1.setText(String.valueOf(numClicks1));
                binding.contador2.setText(String.valueOf(numClicks2));
                binding.contador3.setText(String.valueOf(numClicks3));
                binding.contador4.setText(String.valueOf(numClicks4));
            }
        });


    }
}