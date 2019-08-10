package com.zaphlabs.foodanytime.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.zaphlabs.foodanytime.R;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class ForgotPasswordActivity extends AppCompatActivity implements View.OnClickListener{
ImageView ivback2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        ivback2=findViewById(R.id.ivback2);

        ivback2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ivback2:
                finish();


        }

    }
}
