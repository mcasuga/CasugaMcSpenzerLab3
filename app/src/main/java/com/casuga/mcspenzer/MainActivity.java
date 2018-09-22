package com.casuga.mcspenzer;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_constraint_layout);

        Resources resource = getResources();
        String newTitle = resource.getString(R.string.styles_and_material_design);

        setTitle(newTitle);

        ImageView constraint_imageView = findViewById(R.id.constraintImageView);
        constraint_imageView.setImageResource(R.drawable.reichtag);

        // Set the location
        TextView titleTextView = findViewById(R.id.constraint_titleTextView);
        titleTextView.setText(R.string.title);

        TextView locationTextView = findViewById(R.id.constraint_locationValueTextView);
        locationTextView.setText(R.string.location);

        TextView distanceTextView = findViewById(R.id.constraint_distanceValueTextView);
        distanceTextView.setText(R.string.distance);
    }
}
