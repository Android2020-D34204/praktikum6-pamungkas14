package id.ac.id.telkomuniversity.tass.praktikactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

        TextView tampil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tampil = findViewById(R.id.hasil);

        Bundle bundle = getIntent().getExtras();
        String muncul  = bundle.getString("input");

        tampil.setText(String.valueOf(muncul));

    }
}