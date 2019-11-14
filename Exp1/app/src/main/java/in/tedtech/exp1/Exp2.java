package in.tedtech.exp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Exp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp2);

        EditText txtUser = findViewById(R.id.exp2_txt_username);
        EditText txtPass = findViewById(R.id.exp2_txt_password);

        findViewById(R.id.exp2_btn_login).setOnClickListener(v -> {
            if (txtUser.getText().toString().equals("admin") && txtPass.getText().toString().equalsIgnoreCase("1234")) {
                Toast.makeText(Exp2.this, "Hello Admin", Toast.LENGTH_LONG).show();
            } else if (txtUser.getText().toString().equals("user") && txtPass.getText().toString().equalsIgnoreCase("1234")) {
                Toast.makeText(Exp2.this, "Hello User", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(Exp2.this, "Wrong Credentials", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
