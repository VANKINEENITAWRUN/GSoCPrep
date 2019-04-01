package org.openmrs.mobileapp.ui.base;

import java.lang.ref.WeakReference;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.ViewModel;

public abstract class BaseViewModel<N> extends ViewModel {

    private WeakReference<N> mNavigator;
    private final ObservableBoolean mIsLoading = new ObservableBoolean();
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
