package org.openmrs.mobileapp;

import android.content.Context;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openmrs.mobileapp.models.Consultation;
import org.openmrs.mobileapp.repository.ConsultationRepository;

import java.io.IOException;
import java.util.List;

import androidx.room.Room;
import androidx.test.InstrumentationRegistry;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConsultationReadWriteTest {
    private ConsultationRepository mConsultationRepository;
    private AppDatabase db;

    @Before
    public void createDb() {
        Context context = InstrumentationRegistry.getInstrumentation().getTargetContext();
        db = Room.inMemoryDatabaseBuilder(context, AppDatabase.class).build();
        mConsultationRepository=new ConsultationRepository(db);
    }

    @After
    public void closeDb() throws IOException {
        db.close();
    }

    @Test
    public void writeUserAndReadInList() {
        Consultation consultation = new Consultation("","tawrun","vankineeni","","");
        mConsultationRepository.insert(consultation);
        List<Consultation> byName = mConsultationRepository.findConsultationByFirstName("tawrun");
        assertThat(byName.get(0).getFirstName(),equalTo("tawrun"));
    }
}