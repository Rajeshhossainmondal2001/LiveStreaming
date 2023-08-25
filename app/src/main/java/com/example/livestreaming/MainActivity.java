package com.example.livestreaming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import com.zegocloud.uikit.prebuilt.livestreaming.ZegoUIKitPrebuiltLiveStreamingConfig;
import com.zegocloud.uikit.prebuilt.livestreaming.ZegoUIKitPrebuiltLiveStreamingFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        long appID = 1603557004;
        String appSign = "5d9381309098a825dfb31583df9d678fdb10abfffb957bf6fa75d6ce1866b6e4";
        String userID = Build.MANUFACTURER + "_" + "generateUserId()" ;
        String userName = userID + "_Name" ;
        String liveID = "test_live_id" ;

        findViewById(R.id.start_live).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LiveActivity.class);
            intent.putExtra("host", true);
            intent.putExtra("appID", appID);
            intent.putExtra("appSign", appSign);
            intent.putExtra("userID", userID);
            intent.putExtra("userName", userName);
            intent.putExtra("liveID", liveID);
            startActivity(intent);
        });

        findViewById(R.id.watch_live).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LiveActivity.class);
            intent.putExtra("appID", appID);
            intent.putExtra("appSign", appSign);
            intent.putExtra("userID", userID);
            intent.putExtra("userName", userName);
            intent.putExtra("liveID", liveID);
            startActivity(intent);
        });
    }
}