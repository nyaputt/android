package com.example.avin_projectbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Profile extends AppCompatActivity {

   LinearLayout btn_profile,btn_panduan,btn_syarat, btn_kebijakan, btn_faq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        btn_faq = findViewById(R.id.btn_faq);
        btn_kebijakan =findViewById(R.id.btn_kebijakan);
        btn_syarat = findViewById(R.id.btn_syarat);
        btn_profile = findViewById(R.id.btn_profile);
        btn_panduan = findViewById(R.id.btn_panduan);
        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoedit = new Intent(Profile.this,edit_profile.class);
                startActivity(gotoedit);
            }
        });

        btn_panduan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotopanduan = new Intent(Profile.this,panduan.class);
                startActivity(gotopanduan);
            }
        });

        btn_syarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotosyarat = new Intent(Profile.this,syaratKetentuan.class);
                startActivity(gotosyarat);
            }
        });

        btn_kebijakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotokebijakan = new Intent(Profile.this,kebijakanPrivasi.class);
                startActivity(gotokebijakan);
            }
        });

        btn_faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotofaq = new Intent(Profile.this,faq.class);
                startActivity(gotofaq);
            }
        });
    }
}
