package com.example.dereev_v_16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class taksopark2 extends AppCompatActivity {
    private Button ButtonPhone;
    private ImageButton ButtonMaps;
    private ImageButton imageButton3;
    private ImageButton imageButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taksopark2);

        ButtonPhone = findViewById(R.id.ButtonPhone);
        ButtonMaps = findViewById(R.id.ButtonMaps);
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton3 = findViewById(R.id.imageButton3);

        ButtonPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // При нажатии на кнопку "Позвонить клиенту"
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:89137544373"));
                startActivity(intent);
            }
        });

        ButtonMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // При нажатии на кнопку "Перейти в системное приложение карты"
                Uri locationUri = Uri.parse("geo:0,0?q=Ул. Онтопау, д. 12");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, locationUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // При нажатии на кнопку "Перейти на страницу Statistic"
                Intent intent = new Intent(taksopark2.this, statistic.class);
                startActivity(intent);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(taksopark2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}