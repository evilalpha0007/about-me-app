package com.example.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);

      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
              Intent isplash=new Intent(splashactivity.this,MainActivity.class);
              startActivity(isplash);
              finish();
          }
      },3000);
    }
}