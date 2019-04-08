package org.openmrs.mobileapp.dao;

import org.openmrs.mobileapp.models.Consultation;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface ConsultationDao {

    @Query("SELECT * from consultation_table ORDER BY created_at ASC")
    LiveData<List<Consultation>> getConsultations();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Consultation consultation);

    @Query("DELETE FROM consultation_table")
    void deleteAll();
}
