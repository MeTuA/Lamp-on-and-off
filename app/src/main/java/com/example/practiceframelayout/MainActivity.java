package com.example.practiceframelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickToggleButton(View view){
        ImageView imageOn = (ImageView) findViewById(R.id.onbulb);
        ImageView imageOff = (ImageView) findViewById(R.id.offbulb);

        CharSequence textOn = "Lamp is ON!";
        int time = Toast.LENGTH_SHORT;
        CharSequence textOff = "Lamp is OFF!";


        boolean on = ((ToggleButton) view).isChecked();
        if(on){
            Toast toastOn = Toast.makeText(this, textOn,time);
            imageOn.setVisibility(View.VISIBLE);
            imageOff.setVisibility(View.INVISIBLE);
            toastOn.show();

        }
        else{
            Toast toastOff = Toast.makeText(this, textOff,time);
            imageOn.setVisibility(View.INVISIBLE);
            imageOff.setVisibility(View.VISIBLE);
            toastOff.show();
        }
    }

    public void showAnotherActivity(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}