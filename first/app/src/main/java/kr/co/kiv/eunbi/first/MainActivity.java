package kr.co.kiv.eunbi.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.barunawati);
        setContentView(image);

        setContentView(R.layout.activity_main);
    }
}
