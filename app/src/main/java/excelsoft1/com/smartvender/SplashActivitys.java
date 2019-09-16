package excelsoft1.com.smartvender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivitys extends AppCompatActivity {
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_activitys);
    }

    @Override
    protected void onResume() {

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intialScreenIntent = new Intent(SplashActivitys.this, HomeActivity.class);
                startActivity(intialScreenIntent);
            }
        }, 2000);
        super.onResume();
    }

    @Override
    public void onBackPressed() {
        try {
            timer.cancel();
            timer = null;
        } catch (Exception e) {
        }
        super.onBackPressed();
    }
}


