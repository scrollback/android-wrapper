package io.scrollback.app;

import io.scrollback.library.ScrollbackBroadcastReceiver;


public class BroadcastReceiver extends ScrollbackBroadcastReceiver {
    @Override
    public void setIntentServiceName(String intentServiceName) {
        super.setIntentServiceName(IntentService.class.getName());
    }
}
