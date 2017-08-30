package inocar.regper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt_usuario;
    EditText txt_clave;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt_usuario = (EditText) findViewById(R.id.usuario);
        txt_clave = (EditText) findViewById(R.id.clave);

        btn_login = (Button)  findViewById(R.id.ingresar);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtuser = txt_usuario.getText().toString();
                String txtpasswd = txt_clave.getText().toString();
                //Toast.makeText(getApplicationContext(),"Tu us es:" + textous + " y tu clave es: "+textocl,Toast.LENGTH_LONG).show();

                Log.i("VARIABLE US","USUARIOOOOOOOOOOOOO :  "+txtuser);
                Log.i("VARIABLE CL","CLAVEEEEEEEEE:  "+txtpasswd);

                if(txtuser.compareTo("israel") ==0 && txtpasswd.compareTo("123") ==0){
                       sendMessage(txtuser);
                }else{
                    Toast.makeText(getApplicationContext(),"LOGIN INCORRECTO",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
    /** Called when the user taps the Send button */
    public void sendMessage(String user) {
        Intent intent = new Intent(this, IngresoActivity.class);
        intent.putExtra("USUARIO", user);
        startActivity(intent);
    }

}
