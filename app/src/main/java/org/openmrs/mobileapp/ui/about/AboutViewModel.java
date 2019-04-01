package org.openmrs.mobileapp.ui.about;

import org.openmrs.mobileapp.ui.base.BaseViewModel;



public class AboutViewModel extends BaseViewModel<AboutNavigator> {

//    public AboutViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
//        super(dataManager, schedulerProvider);
//    }

    public void onNavBackClick() {
        getNavigator().goBack();
    }
}
