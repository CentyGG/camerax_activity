package com.example.camerax_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView = findViewById(R.id.imageView);

        // Получение пути к сделанной фотографии из Intent
        String imageFilePath = getIntent().getStringExtra("imageFilePath");
        if (imageFilePath != null) {
            Bitmap bitmap = BitmapFactory.decodeFile(imageFilePath);
            imageView.setImageBitmap(bitmap);
        }
    }
}