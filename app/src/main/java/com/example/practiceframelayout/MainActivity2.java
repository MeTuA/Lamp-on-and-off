package com.example.practiceframelayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
    }
    public void onClickToggleButtonTwo(View view){
        ImageView imageOff = (ImageView) findViewById(R.id.offbulb);
        int imageOn = R.drawable.pic_bulbon;
        int imageOfff = R.drawable.pic_bulboff;

        CharSequence textOn = "Lamp is ON!";
        int time = Toast.LENGTH_SHORT;
        CharSequence textOff = "Lamp is OFF!";


        boolean on = ((ToggleButton) view).isChecked();
        if(on){
            Toast toastOn = Toast.makeText(this, textOn,time);
            imageOff.setImageResource(imageOn);
            toastOn.show();

        }
        else{
            Toast toastOff = Toast.makeText(this, textOff,time);
            imageOff.setImageResource(imageOfff);
            toastOff.show();
        }
    }
}
