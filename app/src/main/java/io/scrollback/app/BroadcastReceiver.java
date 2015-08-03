package io.scrollback.app;

import io.scrollback.library.ScrollbackBroadcastReceiver;

public class BroadcastReceiver extends ScrollbackBroadcastReceiver {
    public BroadcastReceiver() {
        super(IntentService.class.getName());
    }
}
