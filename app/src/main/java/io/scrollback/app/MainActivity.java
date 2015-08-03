package io.scrollback.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;

import io.scrollback.library.ScrollbackFragment;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.add(R.id.main_framelayout, fragment);
        transaction.commit();

        fragment.setLocation(Constants.PROTOCOL, Constants.HOST, Constants.PATH);
        fragment.setEnableDebug(BuildConfig.DEBUG);
        fragment.setGcmSenderId(getString(R.string.gcm_sender_id));

        Intent intent = getIntent();
        String action = intent.getAction();
        Uri uri = intent.getData();

        if (intent.hasExtra("scrollback_path")) {
            fragment.loadPath(getIntent().getStringExtra("scrollback_path"));
        } else if (Intent.ACTION_VIEW.equals(action) && uri != null) {
            fragment.loadUrl(uri.toString());
        }
    }

    ScrollbackFragment fragment = new ScrollbackFragment() {
        @Override
        public boolean onKeyDown(int keyCode, KeyEvent event) {
            return super.onKeyDown(keyCode, event);
        }
    };

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return fragment.onKeyDown(keyCode, event);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
