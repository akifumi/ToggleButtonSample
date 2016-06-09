package net.akifumifukaya.togglebuttonsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageButton.setSelected(!imageButton.isSelected());
                }
            });
        }

        final ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        if (toggleButton != null) {
            toggleButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    toggleButton.setSelected(!toggleButton.isSelected());
                }
            });
        }
    }
}
