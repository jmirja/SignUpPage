package com.example.jmirza.signuppage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView userInfo;
    EditText userTypeEt;
    EditText userNameEt;
    EditText userIdEt;
    EditText userEmailEt;
    EditText userPasswordEt;
    EditText userPasswordAgainEt;
    Button   userSignUpBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInfo=findViewById(R.id.yourInfoTv);
        userTypeEt=findViewById(R.id.userTypeEt);
        userNameEt=findViewById(R.id.userNameEt);
        userIdEt=findViewById(R.id.userIdEt);
        userEmailEt=findViewById(R.id.userEmailEt);
        userPasswordEt=findViewById(R.id.userPasswordEt);
        userPasswordAgainEt=findViewById(R.id.userPasswordAgainEt);
        userSignUpBt=findViewById(R.id.userSignUpBt);

        userSignUpBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
