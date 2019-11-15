package in.tedtech.exp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Code to launch activity on button click
        findViewById(R.id.btn_exp1).setOnClickListener( v -> {
            Intent i = new Intent(this, Exp1.class);
            startActivity(i);
        });

        findViewById(R.id.btn_exp2).setOnClickListener( v -> {
            Intent i = new Intent(this, Exp2.class);
            startActivity(i);
        });

        findViewById(R.id.btn_exp3).setOnClickListener( v -> {
            Intent i = new Intent(this, Exp3.class);
            startActivity(i);
        });

        findViewById(R.id.btn_exp4).setOnClickListener( v -> {
            Intent i = new Intent(this, Exp4.class);
            startActivity(i);
        });
    }
}
