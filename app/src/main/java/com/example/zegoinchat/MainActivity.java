package com.example.zegoinchat;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.zegocloud.zimkit.services.ZIMKit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initZegocloud();

        startActivity(new Intent(MainActivity.this, LoginActivity.class));
        finish();
    }

    public void initZegocloud(){
        ZIMKit.initWith(this.getApplication(),KeyConstant.appID,KeyConstant.appSign);
        // Online notification for the initialization (use the following code if this is needed).
        ZIMKit.initNotifications();
    }
}
