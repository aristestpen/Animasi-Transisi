package com.aries.transition;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    Boolean turnOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!turnOn) {
                    imageView.setImageResource(R.drawable.trans_on);
                    ((TransitionDrawable) imageView.getDrawable()).startTransition(3000);
                    turnOn = true;
                } else {
                    imageView.setImageResource(R.drawable.trans_off);
                    ((TransitionDrawable) imageView.getDrawable()).startTransition(3000);
                    turnOn = false;
                }
            }
        });
    }
}
