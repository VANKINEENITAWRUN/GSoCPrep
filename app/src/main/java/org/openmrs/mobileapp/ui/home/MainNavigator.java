package org.openmrs.mobileapp.ui.home;

public interface MainNavigator {
    void handleError(Throwable throwable);

    void openLoginActivity();

    void submitConsultation();
}
