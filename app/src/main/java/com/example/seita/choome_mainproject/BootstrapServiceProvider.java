package com.example.seita.choome_mainproject;

import android.accounts.AccountsException;
import android.app.Activity;

import com.example.seita.choome_mainproject.core.BootstrapService;

import java.io.IOException;

public interface BootstrapServiceProvider {
    BootstrapService getService(Activity activity) throws IOException, AccountsException;
}
