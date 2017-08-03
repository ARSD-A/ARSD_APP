package com.samridhi.arsdf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;

public class FlashScreen extends Activity {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_screen);
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent sec_act = new Intent(FlashScreen.this, MainActivity.class);
                startActivity(sec_act);
            }
        }, 1000);

    }
}