package com.example.seita.choome_mainproject;

import com.example.seita.choome_mainproject.authenticator.BootstrapAuthenticatorActivity;
import com.example.seita.choome_mainproject.core.TimerService;
import com.example.seita.choome_mainproject.ui.BootstrapActivity;
import com.example.seita.choome_mainproject.ui.BootstrapFragmentActivity;
import com.example.seita.choome_mainproject.ui.BootstrapTimerActivity;
import com.example.seita.choome_mainproject.ui.CheckInsListFragment;
import com.example.seita.choome_mainproject.ui.MainActivity;
import com.example.seita.choome_mainproject.ui.NavigationDrawerFragment;
import com.example.seita.choome_mainproject.ui.NewsActivity;
import com.example.seita.choome_mainproject.ui.NewsListFragment;
import com.example.seita.choome_mainproject.ui.UserActivity;
import com.example.seita.choome_mainproject.ui.UserListFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AndroidModule.class,
                BootstrapModule.class
        }
)
public interface BootstrapComponent {

    void inject(BootstrapApplication target);

    void inject(BootstrapAuthenticatorActivity target);

    void inject(BootstrapTimerActivity target);

    void inject(MainActivity target);

    void inject(CheckInsListFragment target);

    void inject(NavigationDrawerFragment target);

    void inject(NewsActivity target);

    void inject(NewsListFragment target);

    void inject(UserActivity target);

    void inject(UserListFragment target);

    void inject(TimerService target);

    void inject(BootstrapFragmentActivity target);
    void inject(BootstrapActivity target);


}
