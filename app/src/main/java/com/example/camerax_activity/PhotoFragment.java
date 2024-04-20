package com.example.camerax_activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class PhotoFragment extends Fragment {
    private ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_photo, container, false);
        imageView = view.findViewById(R.id.imageView);

        // Получение пути к сделанной фотографии
        Bundle bundle = getArguments();
        if (bundle != null) {
            String imageFilePath = bundle.getString("imageFilePath");
            if (imageFilePath != null) {
                Bitmap bitmap = BitmapFactory.decodeFile(imageFilePath);
                imageView.setImageBitmap(bitmap);
            }
        }
        return view;
    }
}