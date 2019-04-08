package org.openmrs.mobileapp.ui.about;

import android.app.Application;

import org.openmrs.mobileapp.ui.base.BaseViewModel;

import androidx.annotation.NonNull;


public class AboutViewModel extends BaseViewModel<AboutNavigator> {

    public AboutViewModel(@NonNull Application application) {
        super(application);
    }

    public void onNavBackClick() {
        getNavigator().goBack();
    }
}
