package com.ashthebest.myalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

        final int ara[] = {5, 20, 30, 35};

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int time = Integer.parseInt(editText.getText().toString());

                AlarmManager[] alarmManager = new AlarmManager[10000];

                for(int i=0; i<ara.length; i++) {

                    Intent intent = new Intent(MainActivity.this, Alarm.class);
                    PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(), i, intent, 0);

                    alarmManager[i] = (AlarmManager) getSystemService(ALARM_SERVICE);
                    alarmManager[i].set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + ara[i] * 1000, pendingIntent);
                }
            }
        });
    }
}
