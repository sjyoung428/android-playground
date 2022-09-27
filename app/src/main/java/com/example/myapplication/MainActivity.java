package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView choiceText, KindOfAnimal;
    CheckBox checkBox;
    RadioGroup radioGroup;
    RadioButton dog,cat,rabbit;
    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.dino);
        setTitle("애완동물 사진 보기");

        choiceText = (TextView) findViewById(R.id.choiceText);
        KindOfAnimal = (TextView) findViewById(R.id.kindOfAnimal);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        dog = (RadioButton) findViewById(R.id.dog);
        cat = (RadioButton) findViewById(R.id.cat);
        rabbit = (RadioButton) findViewById(R.id.rabbit);
        imageView = (ImageView) findViewById(R.id.imageView);


        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox.isChecked()){
                    KindOfAnimal.setVisibility(View.VISIBLE);
                    radioGroup.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.VISIBLE);
                }else{
                    KindOfAnimal.setVisibility(View.INVISIBLE);
                    radioGroup.setVisibility(View.INVISIBLE);
                    button.setVisibility(View.INVISIBLE);
                    imageView.setVisibility(View.INVISIBLE);
                }
            }
        });

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.dog:
                        imageView.setImageResource(R.drawable.dog);
                    case R.id.cat:
                        imageView.setImageResource(R.drawable.cat);
                    case R.id.rabbit:
                        imageView.setImageResource(R.drawable.rabbit);
                }
            }
        });


    }
}