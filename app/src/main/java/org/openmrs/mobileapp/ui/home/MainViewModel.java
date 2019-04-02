package org.openmrs.mobileapp.ui.home;
import androidx.databinding.ObservableField;


import org.openmrs.mobileapp.ui.base.BaseViewModel;


public class MainViewModel extends BaseViewModel<MainNavigator> {

    private final ObservableField<String> appVersion = new ObservableField<>();


    private final ObservableField<String> userEmail = new ObservableField<>();

    private final ObservableField<String> userName = new ObservableField<>();

    private final ObservableField<String> userProfilePicUrl = new ObservableField<>();

    public ObservableField<String> getAppVersion() {
        return appVersion;
    }

    public ObservableField<String> getUserEmail() {
        return userEmail;
    }

    public ObservableField<String> getUserName() {
        return userName;
    }

    public ObservableField<String> getUserProfilePicUrl() {
        return userProfilePicUrl;
    }

    public void logout() {

    }

    public void onNavMenuCreated() {

    }

    public void updateAppVersion(String version) {
        appVersion.set(version);
    }
}
