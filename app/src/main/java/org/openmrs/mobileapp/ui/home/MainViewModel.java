package org.openmrs.mobileapp.ui.home;
import androidx.databinding.ObservableField;


import org.openmrs.mobileapp.ui.base.BaseViewModel;


public class MainViewModel extends BaseViewModel<MainNavigator> {

    public static final int NO_ACTION = -1, ACTION_ADD_ALL = 0, ACTION_DELETE_SINGLE = 1;

    private final ObservableField<String> appVersion = new ObservableField<>();


    private final ObservableField<String> userEmail = new ObservableField<>();

    private final ObservableField<String> userName = new ObservableField<>();

    private final ObservableField<String> userProfilePicUrl = new ObservableField<>();

    private int action = NO_ACTION;

    public int getAction() {
        return action;
    }

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
//        setIsLoading(true);
//        getCompositeDisposable().add(getDataManager().doLogoutApiCall()
//                .doOnSuccess(response -> getDataManager().setUserAsLoggedOut())
//                .subscribeOn(getSchedulerProvider().io())
//                .observeOn(getSchedulerProvider().ui())
//                .subscribe(response -> {
//                    setIsLoading(false);
//                    getNavigator().openLoginActivity();
//                }, throwable -> {
//                    setIsLoading(false);
//                    getNavigator().handleError(throwable);
//                }));
    }

    public void onNavMenuCreated() {

    }

    public void removeQuestionCard() {
        action = ACTION_DELETE_SINGLE;
    }

    public void updateAppVersion(String version) {
        appVersion.set(version);
    }
}
