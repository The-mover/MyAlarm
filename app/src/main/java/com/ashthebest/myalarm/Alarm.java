package com.ashthebest.myalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

/**
 * Created by Ashraful on 5/21/2018.
 */

public class Alarm extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Alarm beje geche....", Toast.LENGTH_SHORT).show();
        Vibrator v = (Vibrator) context.getSystemService(context.VIBRATOR_SERVICE);
        v.vibrate(1000);
    }
}
