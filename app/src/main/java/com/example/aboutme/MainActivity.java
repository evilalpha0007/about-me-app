package com.example.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView inst;
    public TextView youtube;
    public TextView facebook;
    public ImageView insta;
    public ImageView yt;
    public ImageView fb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inst=findViewById(R.id.instatext);
        youtube=findViewById(R.id.yttext);
        facebook=findViewById(R.id.fbtext);
        insta=findViewById(R.id.instaimg);
        yt=findViewById(R.id.ytimg);
        fb=findViewById(R.id.fbimg);

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotolink("https://www.instagram.com/reel/CX2meRuqq6Mxf5HlQN9zDgKmbgysLOwwm4ypVU0/?igshid=YmMyMTA2M2Y=");
            }
        });

        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotolink("https://youtube.com/channel/UCH-3zofl9993k30WXP8Ll8Q ");
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotolink("https://www.facebook.com/aditya.karandikar.984");
            }
        });

    }
        private void gotolink(String s){
            Uri uri=Uri.parse(s);
            startActivity(new Intent(Intent.ACTION_VIEW,uri));
        }
}