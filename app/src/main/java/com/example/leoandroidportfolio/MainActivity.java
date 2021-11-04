package com.example.leoandroidportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titleText;
    TextView descriptionText;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        Project[] projects = {
                new Project("BMI Calculator","To calculate peoples ideal weight.", R.drawable.calculadora),
                new Project("Calculation App","From Inches to Meters.", R.drawable.einstein),
                new Project("Francesinhas","A menu app for Francesinhas", R.drawable.francesinha),
                new Project("I Buy It","Online Market", R.drawable.market_online)

        };
    }

    private void findViews() {
        titleText = findViewById(R.id.text_view_project_title);
        descriptionText = findViewById(R.id.text_view_project_description);
        imageView = findViewById(R.id.image_view_project_icon);

    }
}