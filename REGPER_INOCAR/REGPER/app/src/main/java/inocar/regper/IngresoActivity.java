package inocar.regper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.SearchEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class IngresoActivity extends AppCompatActivity {

    EditText txt_cedula;
    EditText txt_nombre;
    Spinner spn_instituto;
    Spinner spn_departamento;
    Spinner spn_personal;
    Button btn_guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);



    }
    /** Called when the user taps the Send button */
    public void sendMessage(String user) {
        Intent intent = new Intent(this, RegistroActivity.class);
        intent.putExtra("USUARIO", user);
        startActivity(intent);

        txt_cedula = (EditText) findViewById(R.id.cedula);
        txt_nombre = (EditText) findViewById(R.id.nombre);
        spn_instituto = (Spinner) findViewById(R.id.institucion);
        spn_departamento = (Spinner) findViewById(R.id.departamento);
        spn_personal = (Spinner) findViewById(R.id.personal);

        btn_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtced = txt_cedula.getText().toString();
                String txtname = txt_nombre.getText().toString();
                String txtinst = spn_instituto.getSelectedItem().toString();
                String txtdep = spn_departamento.getSelectedItem().toString();
                String txtpers = spn_personal.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),"Cedula:" + textous + " y tu clave es: "+textocl,Toast.LENGTH_LONG).show();

            }
        });
    }

}
