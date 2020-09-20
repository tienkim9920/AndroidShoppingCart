package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText inputEmail;
    EditText inputPassword;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Ánh xạ
        buttonLogin = findViewById(R.id.buttonLogin);
        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                String email = inputEmail.getText().toString();
//                String password = inputPassword.getText().toString();
//
//                Integer flag = 1;
//
//                if (!email.equals("admin")){
//                    flag = 0;
//                }
//
//                if (!password.equals("123")){
//                    flag = 0;
//                }
//
//                if (flag == 1){
//                    openFunction();
//                }else {
//                    Toast.makeText(LoginActivity.this, "Vui Lòng Kiểm Tra Lại", Toast.LENGTH_LONG).show();
//                }

                openFunction();
            }
        });
    }

    public void openFunction(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}