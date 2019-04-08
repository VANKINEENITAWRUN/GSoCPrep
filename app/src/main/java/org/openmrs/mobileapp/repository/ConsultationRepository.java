package org.openmrs.mobileapp.repository;

import android.app.Application;
import android.os.AsyncTask;

import org.openmrs.mobileapp.AppDatabase;
import org.openmrs.mobileapp.dao.ConsultationDao;
import org.openmrs.mobileapp.models.Consultation;

import java.util.List;

import androidx.lifecycle.LiveData;

public class ConsultationRepository {

    private ConsultationDao mConsultationDao;
    private LiveData<List<Consultation>> mAllConsultations;

    public ConsultationRepository(Application application) {
        AppDatabase db = AppDatabase.getDatabase(application);
        mConsultationDao = db.consultationDao();
        mAllConsultations = mConsultationDao.getConsultations();
    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    LiveData<List<Consultation>> getAllConsultations() {
        return mAllConsultations;
    }

    // You must call this on a non-UI thread or your app will crash.
    // Like this, Room ensures that you're not doing any long running operations on the main
    // thread, blocking the UI.
    public void insert(Consultation Consultation) {
        new insertAsyncTask(mConsultationDao).execute(Consultation);
    }

    private static class insertAsyncTask extends AsyncTask<Consultation, Void, Void> {

        private ConsultationDao mAsyncTaskDao;

        insertAsyncTask(ConsultationDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Consultation... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }
}
