package com.example.a201911047_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText e_mail;
    private EditText password;
    private Button sign_in;
    private Button sign_up;
    private Button forget_passw;

    private static boolean isValidEmail(String email){
        return !TextUtils.isEmpty(email)&&android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e_mail = findViewById(R.id.e_mail);
        password = findViewById(R.id.password);
        sign_in = findViewById(R.id.sign_in);
        sign_up = findViewById(R.id.sign_up);
        forget_passw = findViewById(R.id.forget_passw);
        sign_in.setText("SIGN IN");
        sign_up.setText("SIGN UP");
        forget_passw.setText("FORGET PASSWORD");



        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String get_mail = e_mail.getText().toString();
                String get_passw = password.getText().toString();

                if(!TextUtils.isEmpty(get_mail) && !TextUtils.isEmpty(get_passw)){
                    if(isValidEmail(get_mail) == true){
                        Toast.makeText(MainActivity.this, "E-mail is valid", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "E-mail is invalid", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "E-mail or password is empty", Toast.LENGTH_SHORT).show();
                }

            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String get_mail = e_mail.getText().toString();
                String get_passw = password.getText().toString();

                if(!TextUtils.isEmpty(get_mail) && !TextUtils.isEmpty(get_passw)){
                    if(isValidEmail(get_mail) == true){
                        Toast.makeText(MainActivity.this, "E-mail is valid", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "E-mail is invalid", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "E-mail or password is empty", Toast.LENGTH_SHORT).show();
                }
            }
        });

        forget_passw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Forget Password Button", Toast.LENGTH_SHORT).show();
            }
        });

    }
}