package com.mervecaltay.loginpage4;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Objects;


public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button login;
    Integer attempt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Objects.equals(username.getText().toString(), "admin")&&Objects.equals(password.getText().toString(),"admin"))
                {
                    Toast.makeText(MainActivity.this,"Giriş Başarılıdır!",Toast.LENGTH_LONG).show();
                }else
                {

                    if(attempt >=3){
                        Toast.makeText(MainActivity.this,"3 defa hatalı giriş yapıldı" ,Toast.LENGTH_LONG).show();
                        login.setClickable(false);
                    }
                    else{

                    attempt +=1;
                    Toast.makeText(MainActivity.this,"Kullanıcı adı ve ya şifre hatalı!",Toast.LENGTH_LONG).show();
                    }
                    return;
                }
            }
        });
    }
}