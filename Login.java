package com.example.ntech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    static final String Tag = "Ntechnology";

    String UserName ="admin";
    String Password = "admin";
    Button btnLogin;
    EditText edUserName, edPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(Tag,"onStart Method");
        Toast.makeText(this,"OnCreate",Toast.LENGTH_LONG).show();


/*
        String Login = "Successfully Login";
*/
        btnLogin = (Button)findViewById(R.id.btnLogin);
        edUserName = (EditText)findViewById(R.id.edUserName);
        edPassword = (EditText)findViewById(R.id.edPassword);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*                String password = null;
                String userName = null;*/
                if(UserName.equals(edUserName.getText().toString())&&
                        Password.equals(edPassword.getText().toString())){

                    Intent intent =new Intent(Login.this,MainActivity2.class);
                    startActivity(intent);


                }
               /* if (userName.isEmpty()){
                    edUserName.setError("Please enter User name");
                    edUserName.requestFocus();
                    return;
                }


                if (password.isEmpty()){
                    edPassword.setError("Please enter Password");
                    edPassword.requestFocus();
                    return;


                } else {
                    Toast.makeText(getApplicationContext(),"Login Successfully",Toast.LENGTH_LONG).show();

                }*/
            }

        });

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag,"onStart Method");
        Toast.makeText(this,"onStart",Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag,"onResume Method");
        Toast.makeText(this,"onResume",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag,"onRestart Method");
        Toast.makeText(this,"onRestart",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag,"onPause Method");
        Toast.makeText(this,"onPause",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag,"onStop Method");
        Toast.makeText(this,"onStop",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"onDestroy Method");
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show();

    }

}