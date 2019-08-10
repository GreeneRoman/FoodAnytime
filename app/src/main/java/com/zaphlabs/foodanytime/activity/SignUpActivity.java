package com.zaphlabs.foodanytime.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

import com.zaphlabs.foodanytime.R;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{
ImageView ivback3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ivback3=findViewById(R.id.ivback3);
        ivback3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ivback3:
                finish();
        }
    }
}
