package org.openmrs.mobileapp.ui.home;
import android.app.Application;

import androidx.databinding.ObservableField;


import org.openmrs.mobileapp.models.Consultation;
import org.openmrs.mobileapp.repository.ConsultationRepository;
import org.openmrs.mobileapp.ui.base.BaseViewModel;


public class MainViewModel extends BaseViewModel<MainNavigator> {

    private ConsultationRepository mRepository;

    public MainViewModel(Application application) {
        super(application);
        mRepository = new ConsultationRepository(application);
    }

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

    public boolean verifyDetails(String firstname,String lastname, String phonenumber,String description){

        return true;
    }

    public void insertDetails(String firstname,String lastname, String phonenumber,String description){
        Consultation consultation=new Consultation("",firstname, lastname, phonenumber, description);
        mRepository.insert(consultation);
    }

    public void onSubmitClick(){
        getNavigator().submitConsultation();
    }

    public void updateAppVersion(String version) {
        appVersion.set(version);
    }
}
