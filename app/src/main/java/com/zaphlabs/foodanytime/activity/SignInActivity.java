package com.zaphlabs.foodanytime.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zaphlabs.foodanytime.R;


public class SignInActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvOpenSignUp, tv_forgot_password;
    private ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        tvOpenSignUp = findViewById(R.id.tvOpenSignUp);
        tv_forgot_password = findViewById(R.id.tv_forgot_password);
        ivBack = findViewById(R.id.ivBack);
        tv_forgot_password.setOnClickListener(this);
        tvOpenSignUp.setOnClickListener(this);
        ivBack.setOnClickListener(this);

    }

    public void openSignUpScreen(View view) {
    }

    public void openForgotPasswordScreen(View view) {
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvOpenSignUp:
                startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
                break;
            case R.id.tv_forgot_password:
                startActivity(new Intent(SignInActivity.this, ForgotPasswordActivity.class));
                break;
            case R.id.ivBack:
                finish();
        }
    }

}
