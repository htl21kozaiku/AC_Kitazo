package net.seesaa.htl21kozaiku.AC_Kitazo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.Toast;

public class PowerConnectedReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		if (Intent.ACTION_POWER_CONNECTED.equals(intent.getAction())) {
			
			int plugged = intent.getIntExtra("plugged", 0);
			String acString = "";
            
            switch (plugged) {
            case BatteryManager.BATTERY_PLUGGED_AC:
                acString = "Power connected!!!!! plugged ac";
                break;
            case BatteryManager.BATTERY_PLUGGED_USB:
                acString = "Power connected!!!!! plugged usb";
                break;
            }
            
            Toast.makeText(context, acString, Toast.LENGTH_SHORT).show();
            
		}
		if (Intent.ACTION_POWER_DISCONNECTED.equals(intent.getAction())) {
			Toast.makeText(context, "Power disconnected!!!!!", Toast.LENGTH_SHORT).show();
		}
	}
}
