package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2_Button extends AppCompatActivity {

    Button btn;
    EditText mail,pass;

    String a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_button);

        btn = (Button) findViewById(R.id.log);
        mail = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.password);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a = mail.getText().toString();
                b = pass.getText().toString();

                String msg = "Email: " + a + "\nPassword: " + b;


                if (a.isEmpty() && b.isEmpty()) {
                    mail.setError("Please enter your mail");
                    pass.setError("Please enter your password");
                } else {
//
                     if(a.equals("mayanksinha222000@gmail.com") && b.equals("12345")){
                         Intent intent = new Intent(getApplicationContext() ,MainActivity.class);
                         startActivity(intent);
                         finish();
                     }
                     else{
                         Toast.makeText( MainActivity2_Button.this,  "Credential is mismatch", Toast.LENGTH_LONG).show();
                     }
                    //Intent intent= new Intent(MainActivity2_Button.this, MainActivity.class);
//


                }
            }
        });

    }
}