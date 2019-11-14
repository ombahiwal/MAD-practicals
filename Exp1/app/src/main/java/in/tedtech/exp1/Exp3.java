package in.tedtech.exp1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;

public class Exp3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp3);

        TextView txtSample = findViewById(R.id.exp3_txt_sample);

        findViewById(R.id.exp3_btn_bold).setOnClickListener(v-> {
            txtSample.setTypeface(null, Typeface.BOLD);
        });

        findViewById(R.id.exp3_btn_italic).setOnClickListener(v-> {
            txtSample.setTypeface(null, Typeface.ITALIC);
        });

        findViewById(R.id.exp3_btn_size).setOnClickListener(v-> {
            txtSample.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30f);
        });

        findViewById(R.id.exp3_btn_color).setOnClickListener(v-> {
            txtSample.setTextColor(Color.RED);
        });
    }
}
