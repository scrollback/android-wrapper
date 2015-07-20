package io.scrollback.app;

import io.scrollback.library.ScrollbackBroadcastReceiver;
import io.scrollback.library.ScrollbackIntentService;

/**
 * Created by karthikbalakrishnan on 20/07/15.
 */
public class BroadcastReceiver extends ScrollbackBroadcastReceiver {
    @Override
    public void setIntentServiceName(String intentServiceName) {
        super.setIntentServiceName(ScrollbackIntentService.class.getName());
    }
}
