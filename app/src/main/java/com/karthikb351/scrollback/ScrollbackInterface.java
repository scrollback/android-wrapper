package com.karthikb351.scrollback;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by karthikbalakrishnan on 12/03/15.
 */
public abstract class ScrollbackInterface {

    Context mContext;

    /** Instantiate the interface and set the context */
    ScrollbackInterface(Context c) {
        mContext = c;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void showToast(String toast/*, Function f*/) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();

    }

    public abstract void googleLogin();

    public abstract void facebookLogin();

    public abstract void registerGCM();

    public abstract void onFinishedLoading();
}