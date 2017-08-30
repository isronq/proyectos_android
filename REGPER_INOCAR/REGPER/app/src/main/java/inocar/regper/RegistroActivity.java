package inocar.regper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {

    EditText txt_cedula;
    EditText txt_clave;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);



    }

    /** Called when the user taps the Send button */
    public void sendMessage(String user) {
        Intent intent = new Intent(this, IngresoActivity.class);
        intent.putExtra("USUARIO", user);
        startActivity(intent);
    }


}
