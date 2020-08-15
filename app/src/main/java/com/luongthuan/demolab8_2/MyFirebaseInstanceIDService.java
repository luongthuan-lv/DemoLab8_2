package com.luongthuan.demolab8_2;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseInstanceIDService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.e("Mess",remoteMessage.getNotification().getTitle());
        Log.e("Mess",remoteMessage.getNotification().getBody());
    }

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.e("KEY",s);

    }
}
