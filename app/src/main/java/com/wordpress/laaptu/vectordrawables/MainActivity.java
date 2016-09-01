package com.wordpress.laaptu.vectordrawables;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testAnimatedDrawable();
        calculateXYCircumference();
    }

    private void calculateXYCircumference() {
        int center = 100, radius = 50;
        int[] angles = {0, 60, 90, 120, 180, 240, 270, 320, 360};
        for (int i = 0; i < angles.length; ++i) {
            int x = (int) (center + radius * Math.cos(angles[i]));
            int y = (int) (center + radius * Math.sin(angles[i]));
            System.out.println("X:Y = " + x + ":" + y);
        }
    }

    private void testAnimatedDrawable() {
        imageView = (ImageView) findViewById(R.id.image_view);
        AnimatedVectorDrawable drawable = (AnimatedVectorDrawable) imageView.getDrawable();
        drawable.start();

        ImageView otherImageView = (ImageView) findViewById(R.id.other_image_view);
        AnimatedVectorDrawable otherDrawable = (AnimatedVectorDrawable) otherImageView.getDrawable();
        otherDrawable.start();
    }
}
