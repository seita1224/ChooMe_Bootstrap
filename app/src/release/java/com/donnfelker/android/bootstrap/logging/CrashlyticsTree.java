package com.example.seita.choome_mainproject.logging;

import android.util.Log;

import com.crashlytics.android.Crashlytics;

import timber.log.Timber;

/**
 * A logging implementation which reports 'info', 'warning', and 'error' logs to Crashlytics.
 */
public class CrashlyticsTree extends Timber.Tree {

    @Override
    protected void log(int priority, String tag, String message, Throwable t) {
        if (priority == Log.VERBOSE || priority == Log.DEBUG) {
            return;
        }

        Crashlytics.log(priority, tag, message);

        if (t != null) {
            if (priority == Log.ERROR) {
                Crashlytics.logException(t);
            }
        }

    }
}