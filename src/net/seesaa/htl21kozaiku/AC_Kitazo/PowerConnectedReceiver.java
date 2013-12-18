package com.tappli.android.sample.powerconnectsample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class PowerConnectedReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		if (Intent.ACTION_POWER_CONNECTED.equals(intent.getAction())) {
			Toast.makeText(context, "Power connected!!!!!.", Toast.LENGTH_SHORT).show();
		}
		if (Intent.ACTION_POWER_DISCONNECTED.equals(intent.getAction())) {
			Toast.makeText(context, "Power disconnected!!!!!", Toast.LENGTH_SHORT).show();
		}
	}
}
