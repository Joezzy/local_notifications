package com.mythichelm.localnotifications;

import android.app.PendingIntent;
import android.graphics.Bitmap;

/**
 * Created by simon on 30.03.2018.
 */

public class NotificationSettings {
    public String Title;
    public String Body;
    public boolean IsOngoing;
    public PendingIntent ContentIntent;
    public Bitmap LargeIcon;
    public String Ticker;
    public NotificationAction[] ExtraActions;
    public int Priority = 0;
}
