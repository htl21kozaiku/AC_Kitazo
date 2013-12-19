package net.seesaa.htl21kozaiku.AC_Kitazo;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.os.Build;
import android.widget.Toast;

public class PowerConnectedReceiver extends BroadcastReceiver {

	@TargetApi(Build.VERSION_CODES.ECLAIR)
	@Override
	public void onReceive(Context context, Intent intent) {
		if (Intent.ACTION_POWER_CONNECTED.equals(intent.getAction())) {
			
			int plugged = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
            
            switch (plugged) {
            case BatteryManager.BATTERY_PLUGGED_AC:
            	Toast.makeText(context, "Power connected!!!!! plugged ac", Toast.LENGTH_SHORT).show();
                break;
            case BatteryManager.BATTERY_PLUGGED_USB:
            	Toast.makeText(context, "Power connected!!!!! plugged usb", Toast.LENGTH_SHORT).show();
                break;
            default:
            	Toast.makeText(context, "Power connected!!!!! plugged " + plugged, Toast.LENGTH_SHORT).show();
            	break;
            }
            
		}
		if (Intent.ACTION_POWER_DISCONNECTED.equals(intent.getAction())) {
			Toast.makeText(context, "Power disconnected!!!!!", Toast.LENGTH_SHORT).show();
		}
	}
}
