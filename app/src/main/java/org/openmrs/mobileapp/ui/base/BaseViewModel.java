package org.openmrs.mobileapp.ui.base;

import android.app.Application;

import java.lang.ref.WeakReference;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

public abstract class BaseViewModel<N> extends AndroidViewModel {

    private WeakReference<N> mNavigator;
    private final ObservableBoolean mIsLoading = new ObservableBoolean();

    public BaseViewModel(@NonNull Application application) {
        super(application);
    }

    public ObservableBoolean getIsLoading() {
        return mIsLoading;
    }

    public void setIsLoading(boolean isLoading) {
        mIsLoading.set(isLoading);
    }
    public void setNavigator(N navigator) {
        this.mNavigator = new WeakReference<>(navigator);
    }


    public N getNavigator() {
        return mNavigator.get();
    }

}
