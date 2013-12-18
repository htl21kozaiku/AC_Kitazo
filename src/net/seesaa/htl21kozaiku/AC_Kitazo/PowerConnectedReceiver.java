package net.seesaa.htl21kozaiku.AC_Kitazo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.Toast;

public class PowerConnectedReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		//if (Intent.ACTION_POWER_CONNECTED.equals(intent.getAction())) {
		if (intent.getAction().equals(Intent.ACTION_BATTERY_CHANGED)) {
			
			int plugged = intent.getIntExtra("plugged", 0);
            
            switch (plugged) {
            case BatteryManager.BATTERY_PLUGGED_AC:
            	Toast.makeText(context, "Power connected!!!!! plugged ac", Toast.LENGTH_SHORT).show();
                break;
            case BatteryManager.BATTERY_PLUGGED_USB:
            	Toast.makeText(context, "Power connected!!!!! plugged usb", Toast.LENGTH_SHORT).show();
                break;
            }
            
		}
		if (Intent.ACTION_POWER_DISCONNECTED.equals(intent.getAction())) {
			Toast.makeText(context, "Power disconnected!!!!!", Toast.LENGTH_SHORT).show();
		}
	}
}
